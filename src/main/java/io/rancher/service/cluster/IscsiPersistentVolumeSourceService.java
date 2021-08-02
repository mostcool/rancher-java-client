package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.IscsiPersistentVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface IscsiPersistentVolumeSourceService {

    @GET("iscsiPersistentVolumeSource")
    Call<TypeCollection<IscsiPersistentVolumeSource>> list();

    @GET("iscsiPersistentVolumeSource")
    Call<TypeCollection<IscsiPersistentVolumeSource>> list(@QueryMap Filters filters);

    @GET("iscsiPersistentVolumeSource/{id}")
    Call<IscsiPersistentVolumeSource> get(@Path("id") String id);

    @POST("iscsiPersistentVolumeSource")
    Call<IscsiPersistentVolumeSource> create(@Body IscsiPersistentVolumeSource iscsiPersistentVolumeSource);

    @PUT("iscsiPersistentVolumeSource/{id}")
    Call<IscsiPersistentVolumeSource> update(@Path("id") String id, @Body IscsiPersistentVolumeSource iscsiPersistentVolumeSource);

    @DELETE("iscsiPersistentVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
