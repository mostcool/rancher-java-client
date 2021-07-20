package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.FcVolumeSource;
import retrofit2.Call;
import retrofit2.Response;
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
    Call<Response> delete(@Path("id") String id);
    
}
