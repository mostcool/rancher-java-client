package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.CinderPersistentVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface CinderPersistentVolumeSourceService {

    @GET("cinderPersistentVolumeSource")
    Call<TypeCollection<CinderPersistentVolumeSource>> list();

    @GET("cinderPersistentVolumeSource")
    Call<TypeCollection<CinderPersistentVolumeSource>> list(@QueryMap Filters filters);

    @GET("cinderPersistentVolumeSource/{id}")
    Call<CinderPersistentVolumeSource> get(@Path("id") String id);

    @POST("cinderPersistentVolumeSource")
    Call<CinderPersistentVolumeSource> create(@Body CinderPersistentVolumeSource cinderPersistentVolumeSource);

    @PUT("cinderPersistentVolumeSource/{id}")
    Call<CinderPersistentVolumeSource> update(@Path("id") String id, @Body CinderPersistentVolumeSource cinderPersistentVolumeSource);

    @DELETE("cinderPersistentVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
