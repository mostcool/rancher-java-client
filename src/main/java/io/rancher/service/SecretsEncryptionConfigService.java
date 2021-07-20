package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SecretsEncryptionConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface SecretsEncryptionConfigService {

    @GET("secretsEncryptionConfig")
    Call<TypeCollection<SecretsEncryptionConfig>> list();

    @GET("secretsEncryptionConfig")
    Call<TypeCollection<SecretsEncryptionConfig>> list(@QueryMap Filters filters);

    @GET("secretsEncryptionConfig/{id}")
    Call<SecretsEncryptionConfig> get(@Path("id") String id);

    @POST("secretsEncryptionConfig")
    Call<SecretsEncryptionConfig> create(@Body SecretsEncryptionConfig secretsEncryptionConfig);

    @PUT("secretsEncryptionConfig/{id}")
    Call<SecretsEncryptionConfig> update(@Path("id") String id, @Body SecretsEncryptionConfig secretsEncryptionConfig);

    @DELETE("secretsEncryptionConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
