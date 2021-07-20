package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.TlsRoute;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface TlsRouteService {

    @GET("tlsRoute")
    Call<TypeCollection<TlsRoute>> list();

    @GET("tlsRoute")
    Call<TypeCollection<TlsRoute>> list(@QueryMap Filters filters);

    @GET("tlsRoute/{id}")
    Call<TlsRoute> get(@Path("id") String id);

    @POST("tlsRoute")
    Call<TlsRoute> create(@Body TlsRoute tlsRoute);

    @PUT("tlsRoute/{id}")
    Call<TlsRoute> update(@Path("id") String id, @Body TlsRoute tlsRoute);

    @DELETE("tlsRoute/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
