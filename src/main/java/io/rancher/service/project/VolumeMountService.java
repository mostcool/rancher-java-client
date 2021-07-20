package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.VolumeMount;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface VolumeMountService {

    @GET("volumeMount")
    Call<TypeCollection<VolumeMount>> list();

    @GET("volumeMount")
    Call<TypeCollection<VolumeMount>> list(@QueryMap Filters filters);

    @GET("volumeMount/{id}")
    Call<VolumeMount> get(@Path("id") String id);

    @POST("volumeMount")
    Call<VolumeMount> create(@Body VolumeMount volumeMount);

    @PUT("volumeMount/{id}")
    Call<VolumeMount> update(@Path("id") String id, @Body VolumeMount volumeMount);

    @DELETE("volumeMount/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
