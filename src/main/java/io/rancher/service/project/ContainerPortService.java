package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ContainerPort;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ContainerPortService {

    @GET("containerPort")
    Call<TypeCollection<ContainerPort>> list();

    @GET("containerPort")
    Call<TypeCollection<ContainerPort>> list(@QueryMap Filters filters);

    @GET("containerPort/{id}")
    Call<ContainerPort> get(@Path("id") String id);

    @POST("containerPort")
    Call<ContainerPort> create(@Body ContainerPort containerPort);

    @PUT("containerPort/{id}")
    Call<ContainerPort> update(@Path("id") String id, @Body ContainerPort containerPort);

    @DELETE("containerPort/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
