package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CloudProvider;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface CloudProviderService {

    @GET("cloudProvider")
    Call<TypeCollection<CloudProvider>> list();

    @GET("cloudProvider")
    Call<TypeCollection<CloudProvider>> list(@QueryMap Filters filters);

    @GET("cloudProvider/{id}")
    Call<CloudProvider> get(@Path("id") String id);

    @POST("cloudProvider")
    Call<CloudProvider> create(@Body CloudProvider cloudProvider);

    @PUT("cloudProvider/{id}")
    Call<CloudProvider> update(@Path("id") String id, @Body CloudProvider cloudProvider);

    @DELETE("cloudProvider/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
