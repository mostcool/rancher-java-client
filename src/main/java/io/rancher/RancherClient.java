package io.rancher;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.rancher.client.BasicAuthInterceptor;
import io.rancher.utils.MD5Util;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.net.URL;

public class RancherClient {

    private final Retrofit retrofit;

    private final String url;

    public RancherClient(final Config config) {
        url = config.getUrl().toString();

        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .addInterceptor(
                        BasicAuthInterceptor.auth(config.getAccessKey(), config.getSecretKey())
                )
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request().newBuilder()
                                .addHeader("Accept", "application/json")
                                .build();
                        return chain.proceed(request);
                    }
                });
                //.sslSocketFactory(SSLSocketClient.getSSLSocketFactory());

        this.retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .client(builder.build())
                .addConverterFactory(JacksonConverterFactory.create(configureObjectMapper()))
                .build();
    }

    private ObjectMapper configureObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return objectMapper;
    }

    public String getUrl() {
        return url;
    }

    public <T> T type(Class<T> service) {
        return retrofit.create(service);
    }

    public static class Config {

        private URL url;
        private String accessKey;
        private String secretKey;

        public Config(URL url, String accessKey, String secretKey) {
            this.url = url;
            this.accessKey = accessKey;
            this.secretKey = secretKey;
        }

        public URL getUrl() {
            return url;
        }

        public void setUrl(URL url) {
            this.url = url;
        }

        public String getAccessKey() {
            return accessKey;
        }

        public void setAccessKey(String accessKey) {
            this.accessKey = accessKey;
        }

        public String getSecretKey() {
            return secretKey;
        }

        public void setSecretKey(String secretKey) {
            this.secretKey = secretKey;
        }

        public String md5Key() {
            String key = url.toString() + accessKey + secretKey;
            return MD5Util.getMD5InHex(key);
        }

        public boolean verify() {
            if (null != url) {
                if (null != accessKey && !"".equals(accessKey)) {
                    return null != secretKey && !"".equals(secretKey);
                }
            }
            return false;
        }
    }
}
