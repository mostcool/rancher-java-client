package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.SecretKeySelector;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SecretKeySelectorService {

    @GET("secretKeySelector")
    Call<TypeCollection<SecretKeySelector>> list();

    @GET("secretKeySelector")
    Call<TypeCollection<SecretKeySelector>> list(@QueryMap Filters filters);

    @GET("secretKeySelector/{id}")
    Call<SecretKeySelector> get(@Path("id") String id);

    @POST("secretKeySelector")
    Call<SecretKeySelector> create(@Body SecretKeySelector secretKeySelector);

    @PUT("secretKeySelector/{id}")
    Call<SecretKeySelector> update(@Path("id") String id, @Body SecretKeySelector secretKeySelector);

    @DELETE("secretKeySelector/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
