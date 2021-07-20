package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PrometheusRule;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface PrometheusRuleService {

    @GET("prometheusRule")
    Call<TypeCollection<PrometheusRule>> list();

    @GET("prometheusRule")
    Call<TypeCollection<PrometheusRule>> list(@QueryMap Filters filters);

    @GET("prometheusRule/{id}")
    Call<PrometheusRule> get(@Path("id") String id);

    @POST("prometheusRule")
    Call<PrometheusRule> create(@Body PrometheusRule prometheusRule);

    @PUT("prometheusRule/{id}")
    Call<PrometheusRule> update(@Path("id") String id, @Body PrometheusRule prometheusRule);

    @DELETE("prometheusRule/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
