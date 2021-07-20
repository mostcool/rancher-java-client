package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.NfsVolumeSource;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface NfsVolumeSourceService {

    @GET("nfsVolumeSource")
    Call<TypeCollection<NfsVolumeSource>> list();

    @GET("nfsVolumeSource")
    Call<TypeCollection<NfsVolumeSource>> list(@QueryMap Filters filters);

    @GET("nfsVolumeSource/{id}")
    Call<NfsVolumeSource> get(@Path("id") String id);

    @POST("nfsVolumeSource")
    Call<NfsVolumeSource> create(@Body NfsVolumeSource nfsVolumeSource);

    @PUT("nfsVolumeSource/{id}")
    Call<NfsVolumeSource> update(@Path("id") String id, @Body NfsVolumeSource nfsVolumeSource);

    @DELETE("nfsVolumeSource/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
