package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.KafkaConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface KafkaConfigService {

    @GET("kafkaConfig")
    Call<TypeCollection<KafkaConfig>> list();

    @GET("kafkaConfig")
    Call<TypeCollection<KafkaConfig>> list(@QueryMap Filters filters);

    @GET("kafkaConfig/{id}")
    Call<KafkaConfig> get(@Path("id") String id);

    @POST("kafkaConfig")
    Call<KafkaConfig> create(@Body KafkaConfig kafkaConfig);

    @PUT("kafkaConfig/{id}")
    Call<KafkaConfig> update(@Path("id") String id, @Body KafkaConfig kafkaConfig);

    @DELETE("kafkaConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
