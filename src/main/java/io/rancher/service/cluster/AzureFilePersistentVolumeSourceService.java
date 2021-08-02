package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.AzureFilePersistentVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AzureFilePersistentVolumeSourceService {

    @GET("azureFilePersistentVolumeSource")
    Call<TypeCollection<AzureFilePersistentVolumeSource>> list();

    @GET("azureFilePersistentVolumeSource")
    Call<TypeCollection<AzureFilePersistentVolumeSource>> list(@QueryMap Filters filters);

    @GET("azureFilePersistentVolumeSource/{id}")
    Call<AzureFilePersistentVolumeSource> get(@Path("id") String id);

    @POST("azureFilePersistentVolumeSource")
    Call<AzureFilePersistentVolumeSource> create(@Body AzureFilePersistentVolumeSource azureFilePersistentVolumeSource);

    @PUT("azureFilePersistentVolumeSource/{id}")
    Call<AzureFilePersistentVolumeSource> update(@Path("id") String id, @Body AzureFilePersistentVolumeSource azureFilePersistentVolumeSource);

    @DELETE("azureFilePersistentVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
