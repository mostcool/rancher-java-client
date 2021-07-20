package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CertExpiration;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface CertExpirationService {

    @GET("certExpiration")
    Call<TypeCollection<CertExpiration>> list();

    @GET("certExpiration")
    Call<TypeCollection<CertExpiration>> list(@QueryMap Filters filters);

    @GET("certExpiration/{id}")
    Call<CertExpiration> get(@Path("id") String id);

    @POST("certExpiration")
    Call<CertExpiration> create(@Body CertExpiration certExpiration);

    @PUT("certExpiration/{id}")
    Call<CertExpiration> update(@Path("id") String id, @Body CertExpiration certExpiration);

    @DELETE("certExpiration/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
