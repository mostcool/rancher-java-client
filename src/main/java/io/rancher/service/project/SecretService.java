package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Secret;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface SecretService {

    @GET("secret")
    Call<TypeCollection<Secret>> list();

    @GET("secret")
    Call<TypeCollection<Secret>> list(@QueryMap Filters filters);

    @GET("secret/{id}")
    Call<Secret> get(@Path("id") String id);

    @POST("secret")
    Call<Secret> create(@Body Secret secret);

    @PUT("secret/{id}")
    Call<Secret> update(@Path("id") String id, @Body Secret secret);

    @DELETE("secret/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
