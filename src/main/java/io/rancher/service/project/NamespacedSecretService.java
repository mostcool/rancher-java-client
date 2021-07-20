package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.NamespacedSecret;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface NamespacedSecretService {

    @GET("namespacedSecret")
    Call<TypeCollection<NamespacedSecret>> list();

    @GET("namespacedSecret")
    Call<TypeCollection<NamespacedSecret>> list(@QueryMap Filters filters);

    @GET("namespacedSecret/{id}")
    Call<NamespacedSecret> get(@Path("id") String id);

    @POST("namespacedSecret")
    Call<NamespacedSecret> create(@Body NamespacedSecret namespacedSecret);

    @PUT("namespacedSecret/{id}")
    Call<NamespacedSecret> update(@Path("id") String id, @Body NamespacedSecret namespacedSecret);

    @DELETE("namespacedSecret/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
