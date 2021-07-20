package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Port;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface PortService {

    @GET("port")
    Call<TypeCollection<Port>> list();

    @GET("port")
    Call<TypeCollection<Port>> list(@QueryMap Filters filters);

    @GET("port/{id}")
    Call<Port> get(@Path("id") String id);

    @POST("port")
    Call<Port> create(@Body Port port);

    @PUT("port/{id}")
    Call<Port> update(@Path("id") String id, @Body Port port);

    @DELETE("port/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
