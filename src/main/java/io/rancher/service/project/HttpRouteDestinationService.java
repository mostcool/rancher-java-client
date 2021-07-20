package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.HttpRouteDestination;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface HttpRouteDestinationService {

    @GET("httpRouteDestination")
    Call<TypeCollection<HttpRouteDestination>> list();

    @GET("httpRouteDestination")
    Call<TypeCollection<HttpRouteDestination>> list(@QueryMap Filters filters);

    @GET("httpRouteDestination/{id}")
    Call<HttpRouteDestination> get(@Path("id") String id);

    @POST("httpRouteDestination")
    Call<HttpRouteDestination> create(@Body HttpRouteDestination httpRouteDestination);

    @PUT("httpRouteDestination/{id}")
    Call<HttpRouteDestination> update(@Path("id") String id, @Body HttpRouteDestination httpRouteDestination);

    @DELETE("httpRouteDestination/{id}")
    Call<Response> delete(@Path("id") String id);
    
}