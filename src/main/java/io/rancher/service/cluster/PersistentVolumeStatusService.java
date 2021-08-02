package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.PersistentVolumeStatus;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PersistentVolumeStatusService {

    @GET("persistentVolumeStatus")
    Call<TypeCollection<PersistentVolumeStatus>> list();

    @GET("persistentVolumeStatus")
    Call<TypeCollection<PersistentVolumeStatus>> list(@QueryMap Filters filters);

    @GET("persistentVolumeStatus/{id}")
    Call<PersistentVolumeStatus> get(@Path("id") String id);

    @POST("persistentVolumeStatus")
    Call<PersistentVolumeStatus> create(@Body PersistentVolumeStatus persistentVolumeStatus);

    @PUT("persistentVolumeStatus/{id}")
    Call<PersistentVolumeStatus> update(@Path("id") String id, @Body PersistentVolumeStatus persistentVolumeStatus);

    @DELETE("persistentVolumeStatus/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
