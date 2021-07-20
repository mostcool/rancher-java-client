package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Route53ProviderConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface Route53ProviderConfigService {

    @GET("route53ProviderConfig")
    Call<TypeCollection<Route53ProviderConfig>> list();

    @GET("route53ProviderConfig")
    Call<TypeCollection<Route53ProviderConfig>> list(@QueryMap Filters filters);

    @GET("route53ProviderConfig/{id}")
    Call<Route53ProviderConfig> get(@Path("id") String id);

    @POST("route53ProviderConfig")
    Call<Route53ProviderConfig> create(@Body Route53ProviderConfig route53ProviderConfig);

    @PUT("route53ProviderConfig/{id}")
    Call<Route53ProviderConfig> update(@Path("id") String id, @Body Route53ProviderConfig route53ProviderConfig);

    @DELETE("route53ProviderConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
