package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.NamespacedBasicAuth;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface NamespacedBasicAuthService {

    @GET("namespacedBasicAuth")
    Call<TypeCollection<NamespacedBasicAuth>> list();

    @GET("namespacedBasicAuth")
    Call<TypeCollection<NamespacedBasicAuth>> list(@QueryMap Filters filters);

    @GET("namespacedBasicAuth/{id}")
    Call<NamespacedBasicAuth> get(@Path("id") String id);

    @POST("namespacedBasicAuth")
    Call<NamespacedBasicAuth> create(@Body NamespacedBasicAuth namespacedBasicAuth);

    @PUT("namespacedBasicAuth/{id}")
    Call<NamespacedBasicAuth> update(@Path("id") String id, @Body NamespacedBasicAuth namespacedBasicAuth);

    @DELETE("namespacedBasicAuth/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
