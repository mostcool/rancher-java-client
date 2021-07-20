package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ContainerState;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ContainerStateService {

    @GET("containerState")
    Call<TypeCollection<ContainerState>> list();

    @GET("containerState")
    Call<TypeCollection<ContainerState>> list(@QueryMap Filters filters);

    @GET("containerState/{id}")
    Call<ContainerState> get(@Path("id") String id);

    @POST("containerState")
    Call<ContainerState> create(@Body ContainerState containerState);

    @PUT("containerState/{id}")
    Call<ContainerState> update(@Path("id") String id, @Body ContainerState containerState);

    @DELETE("containerState/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
