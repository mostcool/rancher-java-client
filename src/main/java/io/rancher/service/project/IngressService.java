package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Ingress;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface IngressService {

    @GET("ingress")
    Call<TypeCollection<Ingress>> list();

    @GET("ingress")
    Call<TypeCollection<Ingress>> list(@QueryMap Filters filters);

    @GET("ingress/{id}")
    Call<Ingress> get(@Path("id") String id);

    @POST("ingress")
    Call<Ingress> create(@Body Ingress ingress);

    @PUT("ingress/{id}")
    Call<Ingress> update(@Path("id") String id, @Body Ingress ingress);

    @DELETE("ingress/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
