package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.EmptyDirVolumeSource;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface EmptyDirVolumeSourceService {

    @GET("emptyDirVolumeSource")
    Call<TypeCollection<EmptyDirVolumeSource>> list();

    @GET("emptyDirVolumeSource")
    Call<TypeCollection<EmptyDirVolumeSource>> list(@QueryMap Filters filters);

    @GET("emptyDirVolumeSource/{id}")
    Call<EmptyDirVolumeSource> get(@Path("id") String id);

    @POST("emptyDirVolumeSource")
    Call<EmptyDirVolumeSource> create(@Body EmptyDirVolumeSource emptyDirVolumeSource);

    @PUT("emptyDirVolumeSource/{id}")
    Call<EmptyDirVolumeSource> update(@Path("id") String id, @Body EmptyDirVolumeSource emptyDirVolumeSource);

    @DELETE("emptyDirVolumeSource/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
