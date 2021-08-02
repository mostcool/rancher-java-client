package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.PagerdutyConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PagerdutyConfigService {

    @GET("pagerdutyConfig")
    Call<TypeCollection<PagerdutyConfig>> list();

    @GET("pagerdutyConfig")
    Call<TypeCollection<PagerdutyConfig>> list(@QueryMap Filters filters);

    @GET("pagerdutyConfig/{id}")
    Call<PagerdutyConfig> get(@Path("id") String id);

    @POST("pagerdutyConfig")
    Call<PagerdutyConfig> create(@Body PagerdutyConfig pagerdutyConfig);

    @PUT("pagerdutyConfig/{id}")
    Call<PagerdutyConfig> update(@Path("id") String id, @Body PagerdutyConfig pagerdutyConfig);

    @DELETE("pagerdutyConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
