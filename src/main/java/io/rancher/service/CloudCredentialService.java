package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CloudCredential;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface CloudCredentialService {

    @GET("cloudCredential")
    Call<TypeCollection<CloudCredential>> list();

    @GET("cloudCredential")
    Call<TypeCollection<CloudCredential>> list(@QueryMap Filters filters);

    @GET("cloudCredential/{id}")
    Call<CloudCredential> get(@Path("id") String id);

    @POST("cloudCredential")
    Call<CloudCredential> create(@Body CloudCredential cloudCredential);

    @PUT("cloudCredential/{id}")
    Call<CloudCredential> update(@Path("id") String id, @Body CloudCredential cloudCredential);

    @DELETE("cloudCredential/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
