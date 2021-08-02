package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RkeTaint;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface RkeTaintService {

    @GET("rkeTaint")
    Call<TypeCollection<RkeTaint>> list();

    @GET("rkeTaint")
    Call<TypeCollection<RkeTaint>> list(@QueryMap Filters filters);

    @GET("rkeTaint/{id}")
    Call<RkeTaint> get(@Path("id") String id);

    @POST("rkeTaint")
    Call<RkeTaint> create(@Body RkeTaint rkeTaint);

    @PUT("rkeTaint/{id}")
    Call<RkeTaint> update(@Path("id") String id, @Body RkeTaint rkeTaint);

    @DELETE("rkeTaint/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
