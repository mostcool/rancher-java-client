package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ScaleIOVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ScaleIOVolumeSourceService {

    @GET("scaleIOVolumeSource")
    Call<TypeCollection<ScaleIOVolumeSource>> list();

    @GET("scaleIOVolumeSource")
    Call<TypeCollection<ScaleIOVolumeSource>> list(@QueryMap Filters filters);

    @GET("scaleIOVolumeSource/{id}")
    Call<ScaleIOVolumeSource> get(@Path("id") String id);

    @POST("scaleIOVolumeSource")
    Call<ScaleIOVolumeSource> create(@Body ScaleIOVolumeSource scaleIOVolumeSource);

    @PUT("scaleIOVolumeSource/{id}")
    Call<ScaleIOVolumeSource> update(@Path("id") String id, @Body ScaleIOVolumeSource scaleIOVolumeSource);

    @DELETE("scaleIOVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
