package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.WorkloadMetric;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface WorkloadMetricService {

    @GET("workloadMetric")
    Call<TypeCollection<WorkloadMetric>> list();

    @GET("workloadMetric")
    Call<TypeCollection<WorkloadMetric>> list(@QueryMap Filters filters);

    @GET("workloadMetric/{id}")
    Call<WorkloadMetric> get(@Path("id") String id);

    @POST("workloadMetric")
    Call<WorkloadMetric> create(@Body WorkloadMetric workloadMetric);

    @PUT("workloadMetric/{id}")
    Call<WorkloadMetric> update(@Path("id") String id, @Body WorkloadMetric workloadMetric);

    @DELETE("workloadMetric/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
