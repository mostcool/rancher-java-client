package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.StorageOSPersistentVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface StorageOSPersistentVolumeSourceService {

    @GET("storageOSPersistentVolumeSource")
    Call<TypeCollection<StorageOSPersistentVolumeSource>> list();

    @GET("storageOSPersistentVolumeSource")
    Call<TypeCollection<StorageOSPersistentVolumeSource>> list(@QueryMap Filters filters);

    @GET("storageOSPersistentVolumeSource/{id}")
    Call<StorageOSPersistentVolumeSource> get(@Path("id") String id);

    @POST("storageOSPersistentVolumeSource")
    Call<StorageOSPersistentVolumeSource> create(@Body StorageOSPersistentVolumeSource storageOSPersistentVolumeSource);

    @PUT("storageOSPersistentVolumeSource/{id}")
    Call<StorageOSPersistentVolumeSource> update(@Path("id") String id, @Body StorageOSPersistentVolumeSource storageOSPersistentVolumeSource);

    @DELETE("storageOSPersistentVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
