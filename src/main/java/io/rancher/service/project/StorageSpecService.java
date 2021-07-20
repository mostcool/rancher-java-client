package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.StorageSpec;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface StorageSpecService {

    @GET("storageSpec")
    Call<TypeCollection<StorageSpec>> list();

    @GET("storageSpec")
    Call<TypeCollection<StorageSpec>> list(@QueryMap Filters filters);

    @GET("storageSpec/{id}")
    Call<StorageSpec> get(@Path("id") String id);

    @POST("storageSpec")
    Call<StorageSpec> create(@Body StorageSpec storageSpec);

    @PUT("storageSpec/{id}")
    Call<StorageSpec> update(@Path("id") String id, @Body StorageSpec storageSpec);

    @DELETE("storageSpec/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
