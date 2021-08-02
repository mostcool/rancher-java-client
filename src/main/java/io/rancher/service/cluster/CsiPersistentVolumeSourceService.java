package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.CsiPersistentVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface CsiPersistentVolumeSourceService {

    @GET("csiPersistentVolumeSource")
    Call<TypeCollection<CsiPersistentVolumeSource>> list();

    @GET("csiPersistentVolumeSource")
    Call<TypeCollection<CsiPersistentVolumeSource>> list(@QueryMap Filters filters);

    @GET("csiPersistentVolumeSource/{id}")
    Call<CsiPersistentVolumeSource> get(@Path("id") String id);

    @POST("csiPersistentVolumeSource")
    Call<CsiPersistentVolumeSource> create(@Body CsiPersistentVolumeSource csiPersistentVolumeSource);

    @PUT("csiPersistentVolumeSource/{id}")
    Call<CsiPersistentVolumeSource> update(@Path("id") String id, @Body CsiPersistentVolumeSource csiPersistentVolumeSource);

    @DELETE("csiPersistentVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
