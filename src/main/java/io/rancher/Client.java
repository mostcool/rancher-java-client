package io.rancher;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.util.Base64;

public class Client {

    private final Retrofit retrofit;

    public Client(final String apiHost, final String accessKey, final String secretKey) {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(chain -> {
                    Request request = chain.request().newBuilder()
                            .addHeader("Authorization", "Basic " + Base64.getEncoder().encodeToString((accessKey + ":" + secretKey).getBytes()))
                            .addHeader("Accept", "application/json")
                            .build();
                    return chain.proceed(request);
                })
                .build();

        this.retrofit = new Retrofit.Builder()
                .baseUrl(apiHost)
                .client(okHttpClient)
                .addConverterFactory(JacksonConverterFactory.create(configureObjectMapper()))
                .build();
    }

    private ObjectMapper configureObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return objectMapper;
    }

    public <T> T type(Class<T> service) {
        return retrofit.create(service);
    }
}
