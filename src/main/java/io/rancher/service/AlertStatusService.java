package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AlertStatus;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface AlertStatusService {

    @GET("alertStatus")
    Call<TypeCollection<AlertStatus>> list();

    @GET("alertStatus")
    Call<TypeCollection<AlertStatus>> list(@QueryMap Filters filters);

    @GET("alertStatus/{id}")
    Call<AlertStatus> get(@Path("id") String id);

    @POST("alertStatus")
    Call<AlertStatus> create(@Body AlertStatus alertStatus);

    @PUT("alertStatus/{id}")
    Call<AlertStatus> update(@Path("id") String id, @Body AlertStatus alertStatus);

    @DELETE("alertStatus/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
