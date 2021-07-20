package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.CsiVolumeSource;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface CsiVolumeSourceService {

    @GET("csiVolumeSource")
    Call<TypeCollection<CsiVolumeSource>> list();

    @GET("csiVolumeSource")
    Call<TypeCollection<CsiVolumeSource>> list(@QueryMap Filters filters);

    @GET("csiVolumeSource/{id}")
    Call<CsiVolumeSource> get(@Path("id") String id);

    @POST("csiVolumeSource")
    Call<CsiVolumeSource> create(@Body CsiVolumeSource csiVolumeSource);

    @PUT("csiVolumeSource/{id}")
    Call<CsiVolumeSource> update(@Path("id") String id, @Body CsiVolumeSource csiVolumeSource);

    @DELETE("csiVolumeSource/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
