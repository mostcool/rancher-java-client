package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.QuobyteVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface QuobyteVolumeSourceService {

    @GET("quobyteVolumeSource")
    Call<TypeCollection<QuobyteVolumeSource>> list();

    @GET("quobyteVolumeSource")
    Call<TypeCollection<QuobyteVolumeSource>> list(@QueryMap Filters filters);

    @GET("quobyteVolumeSource/{id}")
    Call<QuobyteVolumeSource> get(@Path("id") String id);

    @POST("quobyteVolumeSource")
    Call<QuobyteVolumeSource> create(@Body QuobyteVolumeSource quobyteVolumeSource);

    @PUT("quobyteVolumeSource/{id}")
    Call<QuobyteVolumeSource> update(@Path("id") String id, @Body QuobyteVolumeSource quobyteVolumeSource);

    @DELETE("quobyteVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
