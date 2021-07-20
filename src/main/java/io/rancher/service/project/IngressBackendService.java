package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.IngressBackend;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface IngressBackendService {

    @GET("ingressBackend")
    Call<TypeCollection<IngressBackend>> list();

    @GET("ingressBackend")
    Call<TypeCollection<IngressBackend>> list(@QueryMap Filters filters);

    @GET("ingressBackend/{id}")
    Call<IngressBackend> get(@Path("id") String id);

    @POST("ingressBackend")
    Call<IngressBackend> create(@Body IngressBackend ingressBackend);

    @PUT("ingressBackend/{id}")
    Call<IngressBackend> update(@Path("id") String id, @Body IngressBackend ingressBackend);

    @DELETE("ingressBackend/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
