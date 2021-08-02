package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ResourceQuotaLimit;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ResourceQuotaLimitService {

    @GET("resourceQuotaLimit")
    Call<TypeCollection<ResourceQuotaLimit>> list();

    @GET("resourceQuotaLimit")
    Call<TypeCollection<ResourceQuotaLimit>> list(@QueryMap Filters filters);

    @GET("resourceQuotaLimit/{id}")
    Call<ResourceQuotaLimit> get(@Path("id") String id);

    @POST("resourceQuotaLimit")
    Call<ResourceQuotaLimit> create(@Body ResourceQuotaLimit resourceQuotaLimit);

    @PUT("resourceQuotaLimit/{id}")
    Call<ResourceQuotaLimit> update(@Path("id") String id, @Body ResourceQuotaLimit resourceQuotaLimit);

    @DELETE("resourceQuotaLimit/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
