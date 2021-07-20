package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.DeploymentRollbackInput;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface DeploymentRollbackInputService {

    @GET("deploymentRollbackInput")
    Call<TypeCollection<DeploymentRollbackInput>> list();

    @GET("deploymentRollbackInput")
    Call<TypeCollection<DeploymentRollbackInput>> list(@QueryMap Filters filters);

    @GET("deploymentRollbackInput/{id}")
    Call<DeploymentRollbackInput> get(@Path("id") String id);

    @POST("deploymentRollbackInput")
    Call<DeploymentRollbackInput> create(@Body DeploymentRollbackInput deploymentRollbackInput);

    @PUT("deploymentRollbackInput/{id}")
    Call<DeploymentRollbackInput> update(@Path("id") String id, @Body DeploymentRollbackInput deploymentRollbackInput);

    @DELETE("deploymentRollbackInput/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
