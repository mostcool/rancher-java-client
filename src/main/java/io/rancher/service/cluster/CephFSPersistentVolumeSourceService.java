package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.CephFSPersistentVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface CephFSPersistentVolumeSourceService {

    @GET("cephFSPersistentVolumeSource")
    Call<TypeCollection<CephFSPersistentVolumeSource>> list();

    @GET("cephFSPersistentVolumeSource")
    Call<TypeCollection<CephFSPersistentVolumeSource>> list(@QueryMap Filters filters);

    @GET("cephFSPersistentVolumeSource/{id}")
    Call<CephFSPersistentVolumeSource> get(@Path("id") String id);

    @POST("cephFSPersistentVolumeSource")
    Call<CephFSPersistentVolumeSource> create(@Body CephFSPersistentVolumeSource cephFSPersistentVolumeSource);

    @PUT("cephFSPersistentVolumeSource/{id}")
    Call<CephFSPersistentVolumeSource> update(@Path("id") String id, @Body CephFSPersistentVolumeSource cephFSPersistentVolumeSource);

    @DELETE("cephFSPersistentVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
