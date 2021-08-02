package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.PersistentVolume;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PersistentVolumeService {

    @GET("persistentVolume")
    Call<TypeCollection<PersistentVolume>> list();

    @GET("persistentVolume")
    Call<TypeCollection<PersistentVolume>> list(@QueryMap Filters filters);

    @GET("persistentVolume/{id}")
    Call<PersistentVolume> get(@Path("id") String id);

    @POST("persistentVolume")
    Call<PersistentVolume> create(@Body PersistentVolume persistentVolume);

    @PUT("persistentVolume/{id}")
    Call<PersistentVolume> update(@Path("id") String id, @Body PersistentVolume persistentVolume);

    @DELETE("persistentVolume/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
