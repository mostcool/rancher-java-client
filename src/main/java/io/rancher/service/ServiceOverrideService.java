package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ServiceOverride;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ServiceOverrideService {

    @GET("serviceOverride")
    Call<TypeCollection<ServiceOverride>> list();

    @GET("serviceOverride")
    Call<TypeCollection<ServiceOverride>> list(@QueryMap Filters filters);

    @GET("serviceOverride/{id}")
    Call<ServiceOverride> get(@Path("id") String id);

    @POST("serviceOverride")
    Call<ServiceOverride> create(@Body ServiceOverride serviceOverride);

    @PUT("serviceOverride/{id}")
    Call<ServiceOverride> update(@Path("id") String id, @Body ServiceOverride serviceOverride);

    @DELETE("serviceOverride/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
