package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.StorageOSVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface StorageOSVolumeSourceService {

    @GET("storageOSVolumeSource")
    Call<TypeCollection<StorageOSVolumeSource>> list();

    @GET("storageOSVolumeSource")
    Call<TypeCollection<StorageOSVolumeSource>> list(@QueryMap Filters filters);

    @GET("storageOSVolumeSource/{id}")
    Call<StorageOSVolumeSource> get(@Path("id") String id);

    @POST("storageOSVolumeSource")
    Call<StorageOSVolumeSource> create(@Body StorageOSVolumeSource storageOSVolumeSource);

    @PUT("storageOSVolumeSource/{id}")
    Call<StorageOSVolumeSource> update(@Path("id") String id, @Body StorageOSVolumeSource storageOSVolumeSource);

    @DELETE("storageOSVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
