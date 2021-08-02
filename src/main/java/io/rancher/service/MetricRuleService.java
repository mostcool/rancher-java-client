package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.MetricRule;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface MetricRuleService {

    @GET("metricRule")
    Call<TypeCollection<MetricRule>> list();

    @GET("metricRule")
    Call<TypeCollection<MetricRule>> list(@QueryMap Filters filters);

    @GET("metricRule/{id}")
    Call<MetricRule> get(@Path("id") String id);

    @POST("metricRule")
    Call<MetricRule> create(@Body MetricRule metricRule);

    @PUT("metricRule/{id}")
    Call<MetricRule> update(@Path("id") String id, @Body MetricRule metricRule);

    @DELETE("metricRule/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
