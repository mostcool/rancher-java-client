package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AllowedCSIDriver;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AllowedCSIDriverService {

    @GET("allowedCSIDriver")
    Call<TypeCollection<AllowedCSIDriver>> list();

    @GET("allowedCSIDriver")
    Call<TypeCollection<AllowedCSIDriver>> list(@QueryMap Filters filters);

    @GET("allowedCSIDriver/{id}")
    Call<AllowedCSIDriver> get(@Path("id") String id);

    @POST("allowedCSIDriver")
    Call<AllowedCSIDriver> create(@Body AllowedCSIDriver allowedCSIDriver);

    @PUT("allowedCSIDriver/{id}")
    Call<AllowedCSIDriver> update(@Path("id") String id, @Body AllowedCSIDriver allowedCSIDriver);

    @DELETE("allowedCSIDriver/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
