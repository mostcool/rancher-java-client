package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.GlusterfsPersistentVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface GlusterfsPersistentVolumeSourceService {

    @GET("glusterfsPersistentVolumeSource")
    Call<TypeCollection<GlusterfsPersistentVolumeSource>> list();

    @GET("glusterfsPersistentVolumeSource")
    Call<TypeCollection<GlusterfsPersistentVolumeSource>> list(@QueryMap Filters filters);

    @GET("glusterfsPersistentVolumeSource/{id}")
    Call<GlusterfsPersistentVolumeSource> get(@Path("id") String id);

    @POST("glusterfsPersistentVolumeSource")
    Call<GlusterfsPersistentVolumeSource> create(@Body GlusterfsPersistentVolumeSource glusterfsPersistentVolumeSource);

    @PUT("glusterfsPersistentVolumeSource/{id}")
    Call<GlusterfsPersistentVolumeSource> update(@Path("id") String id, @Body GlusterfsPersistentVolumeSource glusterfsPersistentVolumeSource);

    @DELETE("glusterfsPersistentVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
