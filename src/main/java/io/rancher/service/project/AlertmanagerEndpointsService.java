package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.AlertmanagerEndpoints;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface AlertmanagerEndpointsService {

    @GET("alertmanagerEndpoints")
    Call<TypeCollection<AlertmanagerEndpoints>> list();

    @GET("alertmanagerEndpoints")
    Call<TypeCollection<AlertmanagerEndpoints>> list(@QueryMap Filters filters);

    @GET("alertmanagerEndpoints/{id}")
    Call<AlertmanagerEndpoints> get(@Path("id") String id);

    @POST("alertmanagerEndpoints")
    Call<AlertmanagerEndpoints> create(@Body AlertmanagerEndpoints alertmanagerEndpoints);

    @PUT("alertmanagerEndpoints/{id}")
    Call<AlertmanagerEndpoints> update(@Path("id") String id, @Body AlertmanagerEndpoints alertmanagerEndpoints);

    @DELETE("alertmanagerEndpoints/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
