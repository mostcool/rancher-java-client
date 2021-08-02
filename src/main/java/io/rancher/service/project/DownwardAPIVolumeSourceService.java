package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.DownwardAPIVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface DownwardAPIVolumeSourceService {

    @GET("downwardAPIVolumeSource")
    Call<TypeCollection<DownwardAPIVolumeSource>> list();

    @GET("downwardAPIVolumeSource")
    Call<TypeCollection<DownwardAPIVolumeSource>> list(@QueryMap Filters filters);

    @GET("downwardAPIVolumeSource/{id}")
    Call<DownwardAPIVolumeSource> get(@Path("id") String id);

    @POST("downwardAPIVolumeSource")
    Call<DownwardAPIVolumeSource> create(@Body DownwardAPIVolumeSource downwardAPIVolumeSource);

    @PUT("downwardAPIVolumeSource/{id}")
    Call<DownwardAPIVolumeSource> update(@Path("id") String id, @Body DownwardAPIVolumeSource downwardAPIVolumeSource);

    @DELETE("downwardAPIVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
