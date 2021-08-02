package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Taint;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface TaintService {

    @GET("taint")
    Call<TypeCollection<Taint>> list();

    @GET("taint")
    Call<TypeCollection<Taint>> list(@QueryMap Filters filters);

    @GET("taint/{id}")
    Call<Taint> get(@Path("id") String id);

    @POST("taint")
    Call<Taint> create(@Body Taint taint);

    @PUT("taint/{id}")
    Call<Taint> update(@Path("id") String id, @Body Taint taint);

    @DELETE("taint/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
