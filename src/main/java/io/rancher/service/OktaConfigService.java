package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.OktaConfig;
import io.rancher.type.SamlConfigTestInput;
import io.rancher.type.SamlConfigTestOutput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface OktaConfigService {

    @GET("oktaConfig")
    Call<TypeCollection<OktaConfig>> list();

    @GET("oktaConfig")
    Call<TypeCollection<OktaConfig>> list(@QueryMap Filters filters);

    @GET("oktaConfig/{id}")
    Call<OktaConfig> get(@Path("id") String id);

    @POST("oktaConfig")
    Call<OktaConfig> create(@Body OktaConfig oktaConfig);

    @PUT("oktaConfig/{id}")
    Call<OktaConfig> update(@Path("id") String id, @Body OktaConfig oktaConfig);

    @DELETE("oktaConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);

    @POST("oktaConfig/{id}?action=testAndEnable")
    Call<SamlConfigTestOutput> testAndEnable(@Path("id") String id, @Body SamlConfigTestInput samlConfigTestInput);
}
