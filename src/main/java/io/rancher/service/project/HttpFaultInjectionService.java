package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.HttpFaultInjection;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface HttpFaultInjectionService {

    @GET("httpFaultInjection")
    Call<TypeCollection<HttpFaultInjection>> list();

    @GET("httpFaultInjection")
    Call<TypeCollection<HttpFaultInjection>> list(@QueryMap Filters filters);

    @GET("httpFaultInjection/{id}")
    Call<HttpFaultInjection> get(@Path("id") String id);

    @POST("httpFaultInjection")
    Call<HttpFaultInjection> create(@Body HttpFaultInjection httpFaultInjection);

    @PUT("httpFaultInjection/{id}")
    Call<HttpFaultInjection> update(@Path("id") String id, @Body HttpFaultInjection httpFaultInjection);

    @DELETE("httpFaultInjection/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
