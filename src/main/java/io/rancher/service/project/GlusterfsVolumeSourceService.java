package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.GlusterfsVolumeSource;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface GlusterfsVolumeSourceService {

    @GET("glusterfsVolumeSource")
    Call<TypeCollection<GlusterfsVolumeSource>> list();

    @GET("glusterfsVolumeSource")
    Call<TypeCollection<GlusterfsVolumeSource>> list(@QueryMap Filters filters);

    @GET("glusterfsVolumeSource/{id}")
    Call<GlusterfsVolumeSource> get(@Path("id") String id);

    @POST("glusterfsVolumeSource")
    Call<GlusterfsVolumeSource> create(@Body GlusterfsVolumeSource glusterfsVolumeSource);

    @PUT("glusterfsVolumeSource/{id}")
    Call<GlusterfsVolumeSource> update(@Path("id") String id, @Body GlusterfsVolumeSource glusterfsVolumeSource);

    @DELETE("glusterfsVolumeSource/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
