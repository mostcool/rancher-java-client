package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.PhotonPersistentDiskVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PhotonPersistentDiskVolumeSourceService {

    @GET("photonPersistentDiskVolumeSource")
    Call<TypeCollection<PhotonPersistentDiskVolumeSource>> list();

    @GET("photonPersistentDiskVolumeSource")
    Call<TypeCollection<PhotonPersistentDiskVolumeSource>> list(@QueryMap Filters filters);

    @GET("photonPersistentDiskVolumeSource/{id}")
    Call<PhotonPersistentDiskVolumeSource> get(@Path("id") String id);

    @POST("photonPersistentDiskVolumeSource")
    Call<PhotonPersistentDiskVolumeSource> create(@Body PhotonPersistentDiskVolumeSource photonPersistentDiskVolumeSource);

    @PUT("photonPersistentDiskVolumeSource/{id}")
    Call<PhotonPersistentDiskVolumeSource> update(@Path("id") String id, @Body PhotonPersistentDiskVolumeSource photonPersistentDiskVolumeSource);

    @DELETE("photonPersistentDiskVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
