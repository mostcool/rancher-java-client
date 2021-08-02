package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.VolumeProjection;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface VolumeProjectionService {

    @GET("volumeProjection")
    Call<TypeCollection<VolumeProjection>> list();

    @GET("volumeProjection")
    Call<TypeCollection<VolumeProjection>> list(@QueryMap Filters filters);

    @GET("volumeProjection/{id}")
    Call<VolumeProjection> get(@Path("id") String id);

    @POST("volumeProjection")
    Call<VolumeProjection> create(@Body VolumeProjection volumeProjection);

    @PUT("volumeProjection/{id}")
    Call<VolumeProjection> update(@Path("id") String id, @Body VolumeProjection volumeProjection);

    @DELETE("volumeProjection/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
