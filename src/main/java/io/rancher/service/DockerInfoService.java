package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.DockerInfo;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface DockerInfoService {

    @GET("dockerInfo")
    Call<TypeCollection<DockerInfo>> list();

    @GET("dockerInfo")
    Call<TypeCollection<DockerInfo>> list(@QueryMap Filters filters);

    @GET("dockerInfo/{id}")
    Call<DockerInfo> get(@Path("id") String id);

    @POST("dockerInfo")
    Call<DockerInfo> create(@Body DockerInfo dockerInfo);

    @PUT("dockerInfo/{id}")
    Call<DockerInfo> update(@Path("id") String id, @Body DockerInfo dockerInfo);

    @DELETE("dockerInfo/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
