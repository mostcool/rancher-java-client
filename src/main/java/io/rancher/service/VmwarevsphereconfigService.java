package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Vmwarevsphereconfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface VmwarevsphereconfigService {

    @GET("vmwarevsphereconfig")
    Call<TypeCollection<Vmwarevsphereconfig>> list();

    @GET("vmwarevsphereconfig")
    Call<TypeCollection<Vmwarevsphereconfig>> list(@QueryMap Filters filters);

    @GET("vmwarevsphereconfig/{id}")
    Call<Vmwarevsphereconfig> get(@Path("id") String id);

    @POST("vmwarevsphereconfig")
    Call<Vmwarevsphereconfig> create(@Body Vmwarevsphereconfig vmwarevsphereconfig);

    @PUT("vmwarevsphereconfig/{id}")
    Call<Vmwarevsphereconfig> update(@Path("id") String id, @Body Vmwarevsphereconfig vmwarevsphereconfig);

    @DELETE("vmwarevsphereconfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
