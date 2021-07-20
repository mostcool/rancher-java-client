package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ElasticsearchConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ElasticsearchConfigService {

    @GET("elasticsearchConfig")
    Call<TypeCollection<ElasticsearchConfig>> list();

    @GET("elasticsearchConfig")
    Call<TypeCollection<ElasticsearchConfig>> list(@QueryMap Filters filters);

    @GET("elasticsearchConfig/{id}")
    Call<ElasticsearchConfig> get(@Path("id") String id);

    @POST("elasticsearchConfig")
    Call<ElasticsearchConfig> create(@Body ElasticsearchConfig elasticsearchConfig);

    @PUT("elasticsearchConfig/{id}")
    Call<ElasticsearchConfig> update(@Path("id") String id, @Body ElasticsearchConfig elasticsearchConfig);

    @DELETE("elasticsearchConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
