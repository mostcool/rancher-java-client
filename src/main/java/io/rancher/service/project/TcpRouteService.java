package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.TcpRoute;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface TcpRouteService {

    @GET("tcpRoute")
    Call<TypeCollection<TcpRoute>> list();

    @GET("tcpRoute")
    Call<TypeCollection<TcpRoute>> list(@QueryMap Filters filters);

    @GET("tcpRoute/{id}")
    Call<TcpRoute> get(@Path("id") String id);

    @POST("tcpRoute")
    Call<TcpRoute> create(@Body TcpRoute tcpRoute);

    @PUT("tcpRoute/{id}")
    Call<TcpRoute> update(@Path("id") String id, @Body TcpRoute tcpRoute);

    @DELETE("tcpRoute/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
