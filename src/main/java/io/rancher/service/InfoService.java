package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Info;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface InfoService {

    @GET("info")
    Call<TypeCollection<Info>> list();

    @GET("info")
    Call<TypeCollection<Info>> list(@QueryMap Filters filters);

    @GET("info/{id}")
    Call<Info> get(@Path("id") String id);

    @POST("info")
    Call<Info> create(@Body Info info);

    @PUT("info/{id}")
    Call<Info> update(@Path("id") String id, @Body Info info);

    @DELETE("info/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
