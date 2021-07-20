package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ContainerStatus;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ContainerStatusService {

    @GET("containerStatus")
    Call<TypeCollection<ContainerStatus>> list();

    @GET("containerStatus")
    Call<TypeCollection<ContainerStatus>> list(@QueryMap Filters filters);

    @GET("containerStatus/{id}")
    Call<ContainerStatus> get(@Path("id") String id);

    @POST("containerStatus")
    Call<ContainerStatus> create(@Body ContainerStatus containerStatus);

    @PUT("containerStatus/{id}")
    Call<ContainerStatus> update(@Path("id") String id, @Body ContainerStatus containerStatus);

    @DELETE("containerStatus/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
