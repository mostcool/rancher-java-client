package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Endpoint;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface EndpointService {

    @GET("endpoint")
    Call<TypeCollection<Endpoint>> list();

    @GET("endpoint")
    Call<TypeCollection<Endpoint>> list(@QueryMap Filters filters);

    @GET("endpoint/{id}")
    Call<Endpoint> get(@Path("id") String id);

    @POST("endpoint")
    Call<Endpoint> create(@Body Endpoint endpoint);

    @PUT("endpoint/{id}")
    Call<Endpoint> update(@Path("id") String id, @Body Endpoint endpoint);

    @DELETE("endpoint/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
