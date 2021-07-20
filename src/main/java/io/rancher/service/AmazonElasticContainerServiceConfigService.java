package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AmazonElasticContainerServiceConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface AmazonElasticContainerServiceConfigService {

    @GET("amazonElasticContainerServiceConfig")
    Call<TypeCollection<AmazonElasticContainerServiceConfig>> list();

    @GET("amazonElasticContainerServiceConfig")
    Call<TypeCollection<AmazonElasticContainerServiceConfig>> list(@QueryMap Filters filters);

    @GET("amazonElasticContainerServiceConfig/{id}")
    Call<AmazonElasticContainerServiceConfig> get(@Path("id") String id);

    @POST("amazonElasticContainerServiceConfig")
    Call<AmazonElasticContainerServiceConfig> create(@Body AmazonElasticContainerServiceConfig amazonElasticContainerServiceConfig);

    @PUT("amazonElasticContainerServiceConfig/{id}")
    Call<AmazonElasticContainerServiceConfig> update(@Path("id") String id, @Body AmazonElasticContainerServiceConfig amazonElasticContainerServiceConfig);

    @DELETE("amazonElasticContainerServiceConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
