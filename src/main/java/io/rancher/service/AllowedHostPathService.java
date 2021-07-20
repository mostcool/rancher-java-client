package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AllowedHostPath;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface AllowedHostPathService {

    @GET("allowedHostPath")
    Call<TypeCollection<AllowedHostPath>> list();

    @GET("allowedHostPath")
    Call<TypeCollection<AllowedHostPath>> list(@QueryMap Filters filters);

    @GET("allowedHostPath/{id}")
    Call<AllowedHostPath> get(@Path("id") String id);

    @POST("allowedHostPath")
    Call<AllowedHostPath> create(@Body AllowedHostPath allowedHostPath);

    @PUT("allowedHostPath/{id}")
    Call<AllowedHostPath> update(@Path("id") String id, @Body AllowedHostPath allowedHostPath);

    @DELETE("allowedHostPath/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
