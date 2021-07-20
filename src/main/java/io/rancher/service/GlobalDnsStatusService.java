package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.GlobalDnsStatus;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface GlobalDnsStatusService {

    @GET("globalDnsStatus")
    Call<TypeCollection<GlobalDnsStatus>> list();

    @GET("globalDnsStatus")
    Call<TypeCollection<GlobalDnsStatus>> list(@QueryMap Filters filters);

    @GET("globalDnsStatus/{id}")
    Call<GlobalDnsStatus> get(@Path("id") String id);

    @POST("globalDnsStatus")
    Call<GlobalDnsStatus> create(@Body GlobalDnsStatus globalDnsStatus);

    @PUT("globalDnsStatus/{id}")
    Call<GlobalDnsStatus> update(@Path("id") String id, @Body GlobalDnsStatus globalDnsStatus);

    @DELETE("globalDnsStatus/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
