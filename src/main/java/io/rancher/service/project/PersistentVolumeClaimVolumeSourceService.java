package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PersistentVolumeClaimVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PersistentVolumeClaimVolumeSourceService {

    @GET("persistentVolumeClaimVolumeSource")
    Call<TypeCollection<PersistentVolumeClaimVolumeSource>> list();

    @GET("persistentVolumeClaimVolumeSource")
    Call<TypeCollection<PersistentVolumeClaimVolumeSource>> list(@QueryMap Filters filters);

    @GET("persistentVolumeClaimVolumeSource/{id}")
    Call<PersistentVolumeClaimVolumeSource> get(@Path("id") String id);

    @POST("persistentVolumeClaimVolumeSource")
    Call<PersistentVolumeClaimVolumeSource> create(@Body PersistentVolumeClaimVolumeSource persistentVolumeClaimVolumeSource);

    @PUT("persistentVolumeClaimVolumeSource/{id}")
    Call<PersistentVolumeClaimVolumeSource> update(@Path("id") String id, @Body PersistentVolumeClaimVolumeSource persistentVolumeClaimVolumeSource);

    @DELETE("persistentVolumeClaimVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
