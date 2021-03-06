package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Notifier;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface NotifierService {

    @GET("notifier")
    Call<TypeCollection<Notifier>> list();

    @GET("notifier")
    Call<TypeCollection<Notifier>> list(@QueryMap Filters filters);

    @GET("notifier/{id}")
    Call<Notifier> get(@Path("id") String id);

    @POST("notifier")
    Call<Notifier> create(@Body Notifier notifier);

    @PUT("notifier/{id}")
    Call<Notifier> update(@Path("id") String id, @Body Notifier notifier);

    @DELETE("notifier/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
