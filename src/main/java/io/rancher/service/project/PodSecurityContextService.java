package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PodSecurityContext;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PodSecurityContextService {

    @GET("podSecurityContext")
    Call<TypeCollection<PodSecurityContext>> list();

    @GET("podSecurityContext")
    Call<TypeCollection<PodSecurityContext>> list(@QueryMap Filters filters);

    @GET("podSecurityContext/{id}")
    Call<PodSecurityContext> get(@Path("id") String id);

    @POST("podSecurityContext")
    Call<PodSecurityContext> create(@Body PodSecurityContext podSecurityContext);

    @PUT("podSecurityContext/{id}")
    Call<PodSecurityContext> update(@Path("id") String id, @Body PodSecurityContext podSecurityContext);

    @DELETE("podSecurityContext/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
