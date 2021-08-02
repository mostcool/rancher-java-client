package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.CinderVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface CinderVolumeSourceService {

    @GET("cinderVolumeSource")
    Call<TypeCollection<CinderVolumeSource>> list();

    @GET("cinderVolumeSource")
    Call<TypeCollection<CinderVolumeSource>> list(@QueryMap Filters filters);

    @GET("cinderVolumeSource/{id}")
    Call<CinderVolumeSource> get(@Path("id") String id);

    @POST("cinderVolumeSource")
    Call<CinderVolumeSource> create(@Body CinderVolumeSource cinderVolumeSource);

    @PUT("cinderVolumeSource/{id}")
    Call<CinderVolumeSource> update(@Path("id") String id, @Body CinderVolumeSource cinderVolumeSource);

    @DELETE("cinderVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
