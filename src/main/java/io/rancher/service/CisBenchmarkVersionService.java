package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CisBenchmarkVersion;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface CisBenchmarkVersionService {

    @GET("cisBenchmarkVersion")
    Call<TypeCollection<CisBenchmarkVersion>> list();

    @GET("cisBenchmarkVersion")
    Call<TypeCollection<CisBenchmarkVersion>> list(@QueryMap Filters filters);

    @GET("cisBenchmarkVersion/{id}")
    Call<CisBenchmarkVersion> get(@Path("id") String id);

    @POST("cisBenchmarkVersion")
    Call<CisBenchmarkVersion> create(@Body CisBenchmarkVersion cisBenchmarkVersion);

    @PUT("cisBenchmarkVersion/{id}")
    Call<CisBenchmarkVersion> update(@Path("id") String id, @Body CisBenchmarkVersion cisBenchmarkVersion);

    @DELETE("cisBenchmarkVersion/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
