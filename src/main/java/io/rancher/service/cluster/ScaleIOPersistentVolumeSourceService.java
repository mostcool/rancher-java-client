package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.ScaleIOPersistentVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ScaleIOPersistentVolumeSourceService {

    @GET("scaleIOPersistentVolumeSource")
    Call<TypeCollection<ScaleIOPersistentVolumeSource>> list();

    @GET("scaleIOPersistentVolumeSource")
    Call<TypeCollection<ScaleIOPersistentVolumeSource>> list(@QueryMap Filters filters);

    @GET("scaleIOPersistentVolumeSource/{id}")
    Call<ScaleIOPersistentVolumeSource> get(@Path("id") String id);

    @POST("scaleIOPersistentVolumeSource")
    Call<ScaleIOPersistentVolumeSource> create(@Body ScaleIOPersistentVolumeSource scaleIOPersistentVolumeSource);

    @PUT("scaleIOPersistentVolumeSource/{id}")
    Call<ScaleIOPersistentVolumeSource> update(@Path("id") String id, @Body ScaleIOPersistentVolumeSource scaleIOPersistentVolumeSource);

    @DELETE("scaleIOPersistentVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
