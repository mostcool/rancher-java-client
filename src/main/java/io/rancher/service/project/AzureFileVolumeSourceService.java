package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.AzureFileVolumeSource;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface AzureFileVolumeSourceService {

    @GET("azureFileVolumeSource")
    Call<TypeCollection<AzureFileVolumeSource>> list();

    @GET("azureFileVolumeSource")
    Call<TypeCollection<AzureFileVolumeSource>> list(@QueryMap Filters filters);

    @GET("azureFileVolumeSource/{id}")
    Call<AzureFileVolumeSource> get(@Path("id") String id);

    @POST("azureFileVolumeSource")
    Call<AzureFileVolumeSource> create(@Body AzureFileVolumeSource azureFileVolumeSource);

    @PUT("azureFileVolumeSource/{id}")
    Call<AzureFileVolumeSource> update(@Path("id") String id, @Body AzureFileVolumeSource azureFileVolumeSource);

    @DELETE("azureFileVolumeSource/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
