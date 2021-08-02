package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.PodRule;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PodRuleService {

    @GET("podRule")
    Call<TypeCollection<PodRule>> list();

    @GET("podRule")
    Call<TypeCollection<PodRule>> list(@QueryMap Filters filters);

    @GET("podRule/{id}")
    Call<PodRule> get(@Path("id") String id);

    @POST("podRule")
    Call<PodRule> create(@Body PodRule podRule);

    @PUT("podRule/{id}")
    Call<PodRule> update(@Path("id") String id, @Body PodRule podRule);

    @DELETE("podRule/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
