package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.EnvVarSource;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface EnvVarSourceService {

    @GET("envVarSource")
    Call<TypeCollection<EnvVarSource>> list();

    @GET("envVarSource")
    Call<TypeCollection<EnvVarSource>> list(@QueryMap Filters filters);

    @GET("envVarSource/{id}")
    Call<EnvVarSource> get(@Path("id") String id);

    @POST("envVarSource")
    Call<EnvVarSource> create(@Body EnvVarSource envVarSource);

    @PUT("envVarSource/{id}")
    Call<EnvVarSource> update(@Path("id") String id, @Body EnvVarSource envVarSource);

    @DELETE("envVarSource/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
