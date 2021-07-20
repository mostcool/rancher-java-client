package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Workload;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface WorkloadService {

    @GET("workload")
    Call<TypeCollection<Workload>> list();

    @GET("workload")
    Call<TypeCollection<Workload>> list(@QueryMap Filters filters);

    @GET("workload/{id}")
    Call<Workload> get(@Path("id") String id);

    @POST("workload")
    Call<Workload> create(@Body Workload workload);

    @PUT("workload/{id}")
    Call<Workload> update(@Path("id") String id, @Body Workload workload);

    @DELETE("workload/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
