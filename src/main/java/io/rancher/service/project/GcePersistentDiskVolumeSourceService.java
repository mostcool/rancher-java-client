package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.GcePersistentDiskVolumeSource;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface GcePersistentDiskVolumeSourceService {

    @GET("gcePersistentDiskVolumeSource")
    Call<TypeCollection<GcePersistentDiskVolumeSource>> list();

    @GET("gcePersistentDiskVolumeSource")
    Call<TypeCollection<GcePersistentDiskVolumeSource>> list(@QueryMap Filters filters);

    @GET("gcePersistentDiskVolumeSource/{id}")
    Call<GcePersistentDiskVolumeSource> get(@Path("id") String id);

    @POST("gcePersistentDiskVolumeSource")
    Call<GcePersistentDiskVolumeSource> create(@Body GcePersistentDiskVolumeSource gcePersistentDiskVolumeSource);

    @PUT("gcePersistentDiskVolumeSource/{id}")
    Call<GcePersistentDiskVolumeSource> update(@Path("id") String id, @Body GcePersistentDiskVolumeSource gcePersistentDiskVolumeSource);

    @DELETE("gcePersistentDiskVolumeSource/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
