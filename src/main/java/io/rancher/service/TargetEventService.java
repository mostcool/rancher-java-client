package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.TargetEvent;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface TargetEventService {

    @GET("targetEvent")
    Call<TypeCollection<TargetEvent>> list();

    @GET("targetEvent")
    Call<TypeCollection<TargetEvent>> list(@QueryMap Filters filters);

    @GET("targetEvent/{id}")
    Call<TargetEvent> get(@Path("id") String id);

    @POST("targetEvent")
    Call<TargetEvent> create(@Body TargetEvent targetEvent);

    @PUT("targetEvent/{id}")
    Call<TargetEvent> update(@Path("id") String id, @Body TargetEvent targetEvent);

    @DELETE("targetEvent/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
