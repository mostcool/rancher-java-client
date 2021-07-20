package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Taint;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface TaintService {

    @GET("taint")
    Call<TypeCollection<Taint>> list();

    @GET("taint")
    Call<TypeCollection<Taint>> list(@QueryMap Filters filters);

    @GET("taint/{id}")
    Call<Taint> get(@Path("id") String id);

    @POST("taint")
    Call<Taint> create(@Body Taint taint);

    @PUT("taint/{id}")
    Call<Taint> update(@Path("id") String id, @Body Taint taint);

    @DELETE("taint/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
