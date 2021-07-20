package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.NamespacedCertificate;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NamespacedCertificateService {

    @GET("namespacedCertificate")
    Call<TypeCollection<NamespacedCertificate>> list();

    @GET("namespacedCertificate")
    Call<TypeCollection<NamespacedCertificate>> list(@QueryMap Filters filters);

    @GET("namespacedCertificate/{id}")
    Call<NamespacedCertificate> get(@Path("id") String id);

    @POST("namespacedCertificate")
    Call<NamespacedCertificate> create(@Body NamespacedCertificate namespacedCertificate);

    @PUT("namespacedCertificate/{id}")
    Call<NamespacedCertificate> update(@Path("id") String id, @Body NamespacedCertificate namespacedCertificate);

    @DELETE("namespacedCertificate/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
