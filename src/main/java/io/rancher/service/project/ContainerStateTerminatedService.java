package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ContainerStateTerminated;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ContainerStateTerminatedService {

    @GET("containerStateTerminated")
    Call<TypeCollection<ContainerStateTerminated>> list();

    @GET("containerStateTerminated")
    Call<TypeCollection<ContainerStateTerminated>> list(@QueryMap Filters filters);

    @GET("containerStateTerminated/{id}")
    Call<ContainerStateTerminated> get(@Path("id") String id);

    @POST("containerStateTerminated")
    Call<ContainerStateTerminated> create(@Body ContainerStateTerminated containerStateTerminated);

    @PUT("containerStateTerminated/{id}")
    Call<ContainerStateTerminated> update(@Path("id") String id, @Body ContainerStateTerminated containerStateTerminated);

    @DELETE("containerStateTerminated/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
