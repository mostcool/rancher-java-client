package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Capabilities;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface CapabilitiesService {

    @GET("capabilities")
    Call<TypeCollection<Capabilities>> list();

    @GET("capabilities")
    Call<TypeCollection<Capabilities>> list(@QueryMap Filters filters);

    @GET("capabilities/{id}")
    Call<Capabilities> get(@Path("id") String id);

    @POST("capabilities")
    Call<Capabilities> create(@Body Capabilities capabilities);

    @PUT("capabilities/{id}")
    Call<Capabilities> update(@Path("id") String id, @Body Capabilities capabilities);

    @DELETE("capabilities/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
