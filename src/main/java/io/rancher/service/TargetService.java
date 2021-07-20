package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Target;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface TargetService {

    @GET("target")
    Call<TypeCollection<Target>> list();

    @GET("target")
    Call<TypeCollection<Target>> list(@QueryMap Filters filters);

    @GET("target/{id}")
    Call<Target> get(@Path("id") String id);

    @POST("target")
    Call<Target> create(@Body Target target);

    @PUT("target/{id}")
    Call<Target> update(@Path("id") String id, @Body Target target);

    @DELETE("target/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
