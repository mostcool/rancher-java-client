package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Gateway;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface GatewayService {

    @GET("gateway")
    Call<TypeCollection<Gateway>> list();

    @GET("gateway")
    Call<TypeCollection<Gateway>> list(@QueryMap Filters filters);

    @GET("gateway/{id}")
    Call<Gateway> get(@Path("id") String id);

    @POST("gateway")
    Call<Gateway> create(@Body Gateway gateway);

    @PUT("gateway/{id}")
    Call<Gateway> update(@Path("id") String id, @Body Gateway gateway);

    @DELETE("gateway/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
