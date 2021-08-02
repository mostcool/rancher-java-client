package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.SecretEnvSource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SecretEnvSourceService {

    @GET("secretEnvSource")
    Call<TypeCollection<SecretEnvSource>> list();

    @GET("secretEnvSource")
    Call<TypeCollection<SecretEnvSource>> list(@QueryMap Filters filters);

    @GET("secretEnvSource/{id}")
    Call<SecretEnvSource> get(@Path("id") String id);

    @POST("secretEnvSource")
    Call<SecretEnvSource> create(@Body SecretEnvSource secretEnvSource);

    @PUT("secretEnvSource/{id}")
    Call<SecretEnvSource> update(@Path("id") String id, @Body SecretEnvSource secretEnvSource);

    @DELETE("secretEnvSource/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
