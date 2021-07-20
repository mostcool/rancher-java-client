package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.NamespacedDockerCredential;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NamespacedDockerCredentialService {

    @GET("namespacedDockerCredential")
    Call<TypeCollection<NamespacedDockerCredential>> list();

    @GET("namespacedDockerCredential")
    Call<TypeCollection<NamespacedDockerCredential>> list(@QueryMap Filters filters);

    @GET("namespacedDockerCredential/{id}")
    Call<NamespacedDockerCredential> get(@Path("id") String id);

    @POST("namespacedDockerCredential")
    Call<NamespacedDockerCredential> create(@Body NamespacedDockerCredential namespacedDockerCredential);

    @PUT("namespacedDockerCredential/{id}")
    Call<NamespacedDockerCredential> update(@Path("id") String id, @Body NamespacedDockerCredential namespacedDockerCredential);

    @DELETE("namespacedDockerCredential/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
