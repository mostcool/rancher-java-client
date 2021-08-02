package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SamlConfigTestInput;
import io.rancher.type.SamlConfigTestOutput;
import io.rancher.type.ShibbolethConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ShibbolethConfigService {

    @GET("shibbolethConfig")
    Call<TypeCollection<ShibbolethConfig>> list();

    @GET("shibbolethConfig")
    Call<TypeCollection<ShibbolethConfig>> list(@QueryMap Filters filters);

    @GET("shibbolethConfig/{id}")
    Call<ShibbolethConfig> get(@Path("id") String id);

    @POST("shibbolethConfig")
    Call<ShibbolethConfig> create(@Body ShibbolethConfig shibbolethConfig);

    @PUT("shibbolethConfig/{id}")
    Call<ShibbolethConfig> update(@Path("id") String id, @Body ShibbolethConfig shibbolethConfig);

    @DELETE("shibbolethConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);

    @POST("shibbolethConfig/{id}?action=testAndEnable")
    Call<SamlConfigTestOutput> testAndEnable(@Path("id") String id, @Body SamlConfigTestInput samlConfigTestInput);
}
