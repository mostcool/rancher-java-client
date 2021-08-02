package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.RbdPersistentVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface RbdPersistentVolumeSourceService {

    @GET("rbdPersistentVolumeSource")
    Call<TypeCollection<RbdPersistentVolumeSource>> list();

    @GET("rbdPersistentVolumeSource")
    Call<TypeCollection<RbdPersistentVolumeSource>> list(@QueryMap Filters filters);

    @GET("rbdPersistentVolumeSource/{id}")
    Call<RbdPersistentVolumeSource> get(@Path("id") String id);

    @POST("rbdPersistentVolumeSource")
    Call<RbdPersistentVolumeSource> create(@Body RbdPersistentVolumeSource rbdPersistentVolumeSource);

    @PUT("rbdPersistentVolumeSource/{id}")
    Call<RbdPersistentVolumeSource> update(@Path("id") String id, @Body RbdPersistentVolumeSource rbdPersistentVolumeSource);

    @DELETE("rbdPersistentVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
