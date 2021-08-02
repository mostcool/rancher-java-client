package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ContainerStateRunning;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ContainerStateRunningService {

    @GET("containerStateRunning")
    Call<TypeCollection<ContainerStateRunning>> list();

    @GET("containerStateRunning")
    Call<TypeCollection<ContainerStateRunning>> list(@QueryMap Filters filters);

    @GET("containerStateRunning/{id}")
    Call<ContainerStateRunning> get(@Path("id") String id);

    @POST("containerStateRunning")
    Call<ContainerStateRunning> create(@Body ContainerStateRunning containerStateRunning);

    @PUT("containerStateRunning/{id}")
    Call<ContainerStateRunning> update(@Path("id") String id, @Body ContainerStateRunning containerStateRunning);

    @DELETE("containerStateRunning/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
