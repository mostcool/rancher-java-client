package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.FlexPersistentVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface FlexPersistentVolumeSourceService {

    @GET("flexPersistentVolumeSource")
    Call<TypeCollection<FlexPersistentVolumeSource>> list();

    @GET("flexPersistentVolumeSource")
    Call<TypeCollection<FlexPersistentVolumeSource>> list(@QueryMap Filters filters);

    @GET("flexPersistentVolumeSource/{id}")
    Call<FlexPersistentVolumeSource> get(@Path("id") String id);

    @POST("flexPersistentVolumeSource")
    Call<FlexPersistentVolumeSource> create(@Body FlexPersistentVolumeSource flexPersistentVolumeSource);

    @PUT("flexPersistentVolumeSource/{id}")
    Call<FlexPersistentVolumeSource> update(@Path("id") String id, @Body FlexPersistentVolumeSource flexPersistentVolumeSource);

    @DELETE("flexPersistentVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
