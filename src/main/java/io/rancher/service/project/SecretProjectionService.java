package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.SecretProjection;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface SecretProjectionService {

    @GET("secretProjection")
    Call<TypeCollection<SecretProjection>> list();

    @GET("secretProjection")
    Call<TypeCollection<SecretProjection>> list(@QueryMap Filters filters);

    @GET("secretProjection/{id}")
    Call<SecretProjection> get(@Path("id") String id);

    @POST("secretProjection")
    Call<SecretProjection> create(@Body SecretProjection secretProjection);

    @PUT("secretProjection/{id}")
    Call<SecretProjection> update(@Path("id") String id, @Body SecretProjection secretProjection);

    @DELETE("secretProjection/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
