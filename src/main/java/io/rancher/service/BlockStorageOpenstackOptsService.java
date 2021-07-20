package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.BlockStorageOpenstackOpts;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface BlockStorageOpenstackOptsService {

    @GET("blockStorageOpenstackOpts")
    Call<TypeCollection<BlockStorageOpenstackOpts>> list();

    @GET("blockStorageOpenstackOpts")
    Call<TypeCollection<BlockStorageOpenstackOpts>> list(@QueryMap Filters filters);

    @GET("blockStorageOpenstackOpts/{id}")
    Call<BlockStorageOpenstackOpts> get(@Path("id") String id);

    @POST("blockStorageOpenstackOpts")
    Call<BlockStorageOpenstackOpts> create(@Body BlockStorageOpenstackOpts blockStorageOpenstackOpts);

    @PUT("blockStorageOpenstackOpts/{id}")
    Call<BlockStorageOpenstackOpts> update(@Path("id") String id, @Body BlockStorageOpenstackOpts blockStorageOpenstackOpts);

    @DELETE("blockStorageOpenstackOpts/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
