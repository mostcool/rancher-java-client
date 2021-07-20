package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ManagementSecret;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ManagementSecretService {

    @GET("managementSecret")
    Call<TypeCollection<ManagementSecret>> list();

    @GET("managementSecret")
    Call<TypeCollection<ManagementSecret>> list(@QueryMap Filters filters);

    @GET("managementSecret/{id}")
    Call<ManagementSecret> get(@Path("id") String id);

    @POST("managementSecret")
    Call<ManagementSecret> create(@Body ManagementSecret managementSecret);

    @PUT("managementSecret/{id}")
    Call<ManagementSecret> update(@Path("id") String id, @Body ManagementSecret managementSecret);

    @DELETE("managementSecret/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
