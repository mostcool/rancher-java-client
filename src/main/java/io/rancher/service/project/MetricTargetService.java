package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.MetricTarget;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface MetricTargetService {

    @GET("metricTarget")
    Call<TypeCollection<MetricTarget>> list();

    @GET("metricTarget")
    Call<TypeCollection<MetricTarget>> list(@QueryMap Filters filters);

    @GET("metricTarget/{id}")
    Call<MetricTarget> get(@Path("id") String id);

    @POST("metricTarget")
    Call<MetricTarget> create(@Body MetricTarget metricTarget);

    @PUT("metricTarget/{id}")
    Call<MetricTarget> update(@Path("id") String id, @Body MetricTarget metricTarget);

    @DELETE("metricTarget/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
