package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.AzureDiskVolumeSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AzureDiskVolumeSourceService {

    @GET("azureDiskVolumeSource")
    Call<TypeCollection<AzureDiskVolumeSource>> list();

    @GET("azureDiskVolumeSource")
    Call<TypeCollection<AzureDiskVolumeSource>> list(@QueryMap Filters filters);

    @GET("azureDiskVolumeSource/{id}")
    Call<AzureDiskVolumeSource> get(@Path("id") String id);

    @POST("azureDiskVolumeSource")
    Call<AzureDiskVolumeSource> create(@Body AzureDiskVolumeSource azureDiskVolumeSource);

    @PUT("azureDiskVolumeSource/{id}")
    Call<AzureDiskVolumeSource> update(@Path("id") String id, @Body AzureDiskVolumeSource azureDiskVolumeSource);

    @DELETE("azureDiskVolumeSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
