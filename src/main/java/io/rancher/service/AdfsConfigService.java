package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AdfsConfig;
import io.rancher.type.SamlConfigTestInput;
import io.rancher.type.SamlConfigTestOutput;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface AdfsConfigService {

    @GET("adfsConfig")
    Call<TypeCollection<AdfsConfig>> list();

    @GET("adfsConfig")
    Call<TypeCollection<AdfsConfig>> list(@QueryMap Filters filters);

    @GET("adfsConfig/{id}")
    Call<AdfsConfig> get(@Path("id") String id);

    @POST("adfsConfig")
    Call<AdfsConfig> create(@Body AdfsConfig adfsConfig);

    @PUT("adfsConfig/{id}")
    Call<AdfsConfig> update(@Path("id") String id, @Body AdfsConfig adfsConfig);

    @DELETE("adfsConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
    @POST("adfsConfig/{id}?action=testAndEnable")
    Call<SamlConfigTestOutput> testAndEnable(@Path("id") String id, @Body SamlConfigTestInput samlConfigTestInput);
    
}
