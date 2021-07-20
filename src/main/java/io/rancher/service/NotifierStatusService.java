package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NotifierStatus;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface NotifierStatusService {

    @GET("notifierStatus")
    Call<TypeCollection<NotifierStatus>> list();

    @GET("notifierStatus")
    Call<TypeCollection<NotifierStatus>> list(@QueryMap Filters filters);

    @GET("notifierStatus/{id}")
    Call<NotifierStatus> get(@Path("id") String id);

    @POST("notifierStatus")
    Call<NotifierStatus> create(@Body NotifierStatus notifierStatus);

    @PUT("notifierStatus/{id}")
    Call<NotifierStatus> update(@Path("id") String id, @Body NotifierStatus notifierStatus);

    @DELETE("notifierStatus/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
