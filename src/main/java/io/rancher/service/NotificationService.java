package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Notification;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface NotificationService {

    @GET("notification")
    Call<TypeCollection<Notification>> list();

    @GET("notification")
    Call<TypeCollection<Notification>> list(@QueryMap Filters filters);

    @GET("notification/{id}")
    Call<Notification> get(@Path("id") String id);

    @POST("notification")
    Call<Notification> create(@Body Notification notification);

    @PUT("notification/{id}")
    Call<Notification> update(@Path("id") String id, @Body Notification notification);

    @DELETE("notification/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
