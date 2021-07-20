package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ContainerStateWaiting;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ContainerStateWaitingService {

    @GET("containerStateWaiting")
    Call<TypeCollection<ContainerStateWaiting>> list();

    @GET("containerStateWaiting")
    Call<TypeCollection<ContainerStateWaiting>> list(@QueryMap Filters filters);

    @GET("containerStateWaiting/{id}")
    Call<ContainerStateWaiting> get(@Path("id") String id);

    @POST("containerStateWaiting")
    Call<ContainerStateWaiting> create(@Body ContainerStateWaiting containerStateWaiting);

    @PUT("containerStateWaiting/{id}")
    Call<ContainerStateWaiting> update(@Path("id") String id, @Body ContainerStateWaiting containerStateWaiting);

    @DELETE("containerStateWaiting/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
