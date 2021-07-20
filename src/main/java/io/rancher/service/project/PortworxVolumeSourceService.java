package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PortworxVolumeSource;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface PortworxVolumeSourceService {

    @GET("portworxVolumeSource")
    Call<TypeCollection<PortworxVolumeSource>> list();

    @GET("portworxVolumeSource")
    Call<TypeCollection<PortworxVolumeSource>> list(@QueryMap Filters filters);

    @GET("portworxVolumeSource/{id}")
    Call<PortworxVolumeSource> get(@Path("id") String id);

    @POST("portworxVolumeSource")
    Call<PortworxVolumeSource> create(@Body PortworxVolumeSource portworxVolumeSource);

    @PUT("portworxVolumeSource/{id}")
    Call<PortworxVolumeSource> update(@Path("id") String id, @Body PortworxVolumeSource portworxVolumeSource);

    @DELETE("portworxVolumeSource/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
