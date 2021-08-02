package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RouteOpenstackOpts;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface RouteOpenstackOptsService {

    @GET("routeOpenstackOpts")
    Call<TypeCollection<RouteOpenstackOpts>> list();

    @GET("routeOpenstackOpts")
    Call<TypeCollection<RouteOpenstackOpts>> list(@QueryMap Filters filters);

    @GET("routeOpenstackOpts/{id}")
    Call<RouteOpenstackOpts> get(@Path("id") String id);

    @POST("routeOpenstackOpts")
    Call<RouteOpenstackOpts> create(@Body RouteOpenstackOpts routeOpenstackOpts);

    @PUT("routeOpenstackOpts/{id}")
    Call<RouteOpenstackOpts> update(@Path("id") String id, @Body RouteOpenstackOpts routeOpenstackOpts);

    @DELETE("routeOpenstackOpts/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
