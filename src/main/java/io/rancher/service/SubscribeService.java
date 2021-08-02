package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Subscribe;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SubscribeService {

    @GET("subscribe")
    Call<TypeCollection<Subscribe>> list();

    @GET("subscribe")
    Call<TypeCollection<Subscribe>> list(@QueryMap Filters filters);

    @GET("subscribe/{id}")
    Call<Subscribe> get(@Path("id") String id);

    @POST("subscribe")
    Call<Subscribe> create(@Body Subscribe subscribe);

    @PUT("subscribe/{id}")
    Call<Subscribe> update(@Path("id") String id, @Body Subscribe subscribe);

    @DELETE("subscribe/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
