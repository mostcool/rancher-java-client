package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.RegistryCredential;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface RegistryCredentialService {

    @GET("registryCredential")
    Call<TypeCollection<RegistryCredential>> list();

    @GET("registryCredential")
    Call<TypeCollection<RegistryCredential>> list(@QueryMap Filters filters);

    @GET("registryCredential/{id}")
    Call<RegistryCredential> get(@Path("id") String id);

    @POST("registryCredential")
    Call<RegistryCredential> create(@Body RegistryCredential registryCredential);

    @PUT("registryCredential/{id}")
    Call<RegistryCredential> update(@Path("id") String id, @Body RegistryCredential registryCredential);

    @DELETE("registryCredential/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
