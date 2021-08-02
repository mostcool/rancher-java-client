package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.SecretVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SecretVolumeSourceService {

    @GET("secretVolumeSource")
    Call<TypeCollection<SecretVolumeSource>> list();

    @GET("secretVolumeSource")
    Call<TypeCollection<SecretVolumeSource>> list(@QueryMap Filters filters);

    @GET("secretVolumeSource/{id}")
    Call<SecretVolumeSource> get(@Path("id") String id);

    @POST("secretVolumeSource")
    Call<SecretVolumeSource> create(@Body SecretVolumeSource secretVolumeSource);

    @PUT("secretVolumeSource/{id}")
    Call<SecretVolumeSource> update(@Path("id") String id, @Body SecretVolumeSource secretVolumeSource);

    @DELETE("secretVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
