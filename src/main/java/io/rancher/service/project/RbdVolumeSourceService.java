package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.RbdVolumeSource;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface RbdVolumeSourceService {

    @GET("rbdVolumeSource")
    Call<TypeCollection<RbdVolumeSource>> list();

    @GET("rbdVolumeSource")
    Call<TypeCollection<RbdVolumeSource>> list(@QueryMap Filters filters);

    @GET("rbdVolumeSource/{id}")
    Call<RbdVolumeSource> get(@Path("id") String id);

    @POST("rbdVolumeSource")
    Call<RbdVolumeSource> create(@Body RbdVolumeSource rbdVolumeSource);

    @PUT("rbdVolumeSource/{id}")
    Call<RbdVolumeSource> update(@Path("id") String id, @Body RbdVolumeSource rbdVolumeSource);

    @DELETE("rbdVolumeSource/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
