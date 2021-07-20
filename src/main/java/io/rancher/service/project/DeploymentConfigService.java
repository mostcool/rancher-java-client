package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.DeploymentConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface DeploymentConfigService {

    @GET("deploymentConfig")
    Call<TypeCollection<DeploymentConfig>> list();

    @GET("deploymentConfig")
    Call<TypeCollection<DeploymentConfig>> list(@QueryMap Filters filters);

    @GET("deploymentConfig/{id}")
    Call<DeploymentConfig> get(@Path("id") String id);

    @POST("deploymentConfig")
    Call<DeploymentConfig> create(@Body DeploymentConfig deploymentConfig);

    @PUT("deploymentConfig/{id}")
    Call<DeploymentConfig> update(@Path("id") String id, @Body DeploymentConfig deploymentConfig);

    @DELETE("deploymentConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
