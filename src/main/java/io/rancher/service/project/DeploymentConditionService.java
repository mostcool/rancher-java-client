package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.DeploymentCondition;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface DeploymentConditionService {

    @GET("deploymentCondition")
    Call<TypeCollection<DeploymentCondition>> list();

    @GET("deploymentCondition")
    Call<TypeCollection<DeploymentCondition>> list(@QueryMap Filters filters);

    @GET("deploymentCondition/{id}")
    Call<DeploymentCondition> get(@Path("id") String id);

    @POST("deploymentCondition")
    Call<DeploymentCondition> create(@Body DeploymentCondition deploymentCondition);

    @PUT("deploymentCondition/{id}")
    Call<DeploymentCondition> update(@Path("id") String id, @Body DeploymentCondition deploymentCondition);

    @DELETE("deploymentCondition/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
