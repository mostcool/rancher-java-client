package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.CephFSVolumeSource;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface CephFSVolumeSourceService {

    @GET("cephFSVolumeSource")
    Call<TypeCollection<CephFSVolumeSource>> list();

    @GET("cephFSVolumeSource")
    Call<TypeCollection<CephFSVolumeSource>> list(@QueryMap Filters filters);

    @GET("cephFSVolumeSource/{id}")
    Call<CephFSVolumeSource> get(@Path("id") String id);

    @POST("cephFSVolumeSource")
    Call<CephFSVolumeSource> create(@Body CephFSVolumeSource cephFSVolumeSource);

    @PUT("cephFSVolumeSource/{id}")
    Call<CephFSVolumeSource> update(@Path("id") String id, @Body CephFSVolumeSource cephFSVolumeSource);

    @DELETE("cephFSVolumeSource/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
