package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ContainerResourceLimit;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ContainerResourceLimitService {

    @GET("containerResourceLimit")
    Call<TypeCollection<ContainerResourceLimit>> list();

    @GET("containerResourceLimit")
    Call<TypeCollection<ContainerResourceLimit>> list(@QueryMap Filters filters);

    @GET("containerResourceLimit/{id}")
    Call<ContainerResourceLimit> get(@Path("id") String id);

    @POST("containerResourceLimit")
    Call<ContainerResourceLimit> create(@Body ContainerResourceLimit containerResourceLimit);

    @PUT("containerResourceLimit/{id}")
    Call<ContainerResourceLimit> update(@Path("id") String id, @Body ContainerResourceLimit containerResourceLimit);

    @DELETE("containerResourceLimit/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
