package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ConfigMapVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ConfigMapVolumeSourceService {

    @GET("configMapVolumeSource")
    Call<TypeCollection<ConfigMapVolumeSource>> list();

    @GET("configMapVolumeSource")
    Call<TypeCollection<ConfigMapVolumeSource>> list(@QueryMap Filters filters);

    @GET("configMapVolumeSource/{id}")
    Call<ConfigMapVolumeSource> get(@Path("id") String id);

    @POST("configMapVolumeSource")
    Call<ConfigMapVolumeSource> create(@Body ConfigMapVolumeSource configMapVolumeSource);

    @PUT("configMapVolumeSource/{id}")
    Call<ConfigMapVolumeSource> update(@Path("id") String id, @Body ConfigMapVolumeSource configMapVolumeSource);

    @DELETE("configMapVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
