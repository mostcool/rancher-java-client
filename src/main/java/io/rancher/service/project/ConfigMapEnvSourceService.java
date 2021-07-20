package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ConfigMapEnvSource;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ConfigMapEnvSourceService {

    @GET("configMapEnvSource")
    Call<TypeCollection<ConfigMapEnvSource>> list();

    @GET("configMapEnvSource")
    Call<TypeCollection<ConfigMapEnvSource>> list(@QueryMap Filters filters);

    @GET("configMapEnvSource/{id}")
    Call<ConfigMapEnvSource> get(@Path("id") String id);

    @POST("configMapEnvSource")
    Call<ConfigMapEnvSource> create(@Body ConfigMapEnvSource configMapEnvSource);

    @PUT("configMapEnvSource/{id}")
    Call<ConfigMapEnvSource> update(@Path("id") String id, @Body ConfigMapEnvSource configMapEnvSource);

    @DELETE("configMapEnvSource/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
