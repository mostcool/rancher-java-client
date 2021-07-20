package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.StorageOSVolumeSource;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface StorageOSVolumeSourceService {

    @GET("storageOSVolumeSource")
    Call<TypeCollection<StorageOSVolumeSource>> list();

    @GET("storageOSVolumeSource")
    Call<TypeCollection<StorageOSVolumeSource>> list(@QueryMap Filters filters);

    @GET("storageOSVolumeSource/{id}")
    Call<StorageOSVolumeSource> get(@Path("id") String id);

    @POST("storageOSVolumeSource")
    Call<StorageOSVolumeSource> create(@Body StorageOSVolumeSource storageOSVolumeSource);

    @PUT("storageOSVolumeSource/{id}")
    Call<StorageOSVolumeSource> update(@Path("id") String id, @Body StorageOSVolumeSource storageOSVolumeSource);

    @DELETE("storageOSVolumeSource/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
