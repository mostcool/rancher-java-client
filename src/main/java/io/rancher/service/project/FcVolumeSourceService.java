package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.FcVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface FcVolumeSourceService {

    @GET("fcVolumeSource")
    Call<TypeCollection<FcVolumeSource>> list();

    @GET("fcVolumeSource")
    Call<TypeCollection<FcVolumeSource>> list(@QueryMap Filters filters);

    @GET("fcVolumeSource/{id}")
    Call<FcVolumeSource> get(@Path("id") String id);

    @POST("fcVolumeSource")
    Call<FcVolumeSource> create(@Body FcVolumeSource fcVolumeSource);

    @PUT("fcVolumeSource/{id}")
    Call<FcVolumeSource> update(@Path("id") String id, @Body FcVolumeSource fcVolumeSource);

    @DELETE("fcVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
