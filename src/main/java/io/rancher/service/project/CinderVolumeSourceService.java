package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.CinderVolumeSource;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface CinderVolumeSourceService {

    @GET("cinderVolumeSource")
    Call<TypeCollection<CinderVolumeSource>> list();

    @GET("cinderVolumeSource")
    Call<TypeCollection<CinderVolumeSource>> list(@QueryMap Filters filters);

    @GET("cinderVolumeSource/{id}")
    Call<CinderVolumeSource> get(@Path("id") String id);

    @POST("cinderVolumeSource")
    Call<CinderVolumeSource> create(@Body CinderVolumeSource cinderVolumeSource);

    @PUT("cinderVolumeSource/{id}")
    Call<CinderVolumeSource> update(@Path("id") String id, @Body CinderVolumeSource cinderVolumeSource);

    @DELETE("cinderVolumeSource/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
