package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.IscsiVolumeSource;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface IscsiVolumeSourceService {

    @GET("iscsiVolumeSource")
    Call<TypeCollection<IscsiVolumeSource>> list();

    @GET("iscsiVolumeSource")
    Call<TypeCollection<IscsiVolumeSource>> list(@QueryMap Filters filters);

    @GET("iscsiVolumeSource/{id}")
    Call<IscsiVolumeSource> get(@Path("id") String id);

    @POST("iscsiVolumeSource")
    Call<IscsiVolumeSource> create(@Body IscsiVolumeSource iscsiVolumeSource);

    @PUT("iscsiVolumeSource/{id}")
    Call<IscsiVolumeSource> update(@Path("id") String id, @Body IscsiVolumeSource iscsiVolumeSource);

    @DELETE("iscsiVolumeSource/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
