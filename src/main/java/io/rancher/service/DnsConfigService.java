package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.DnsConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface DnsConfigService {

    @GET("dnsConfig")
    Call<TypeCollection<DnsConfig>> list();

    @GET("dnsConfig")
    Call<TypeCollection<DnsConfig>> list(@QueryMap Filters filters);

    @GET("dnsConfig/{id}")
    Call<DnsConfig> get(@Path("id") String id);

    @POST("dnsConfig")
    Call<DnsConfig> create(@Body DnsConfig dnsConfig);

    @PUT("dnsConfig/{id}")
    Call<DnsConfig> update(@Path("id") String id, @Body DnsConfig dnsConfig);

    @DELETE("dnsConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
