package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.GlobalDnsProvider;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface GlobalDnsProviderService {

    @GET("globalDnsProvider")
    Call<TypeCollection<GlobalDnsProvider>> list();

    @GET("globalDnsProvider")
    Call<TypeCollection<GlobalDnsProvider>> list(@QueryMap Filters filters);

    @GET("globalDnsProvider/{id}")
    Call<GlobalDnsProvider> get(@Path("id") String id);

    @POST("globalDnsProvider")
    Call<GlobalDnsProvider> create(@Body GlobalDnsProvider globalDnsProvider);

    @PUT("globalDnsProvider/{id}")
    Call<GlobalDnsProvider> update(@Path("id") String id, @Body GlobalDnsProvider globalDnsProvider);

    @DELETE("globalDnsProvider/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
