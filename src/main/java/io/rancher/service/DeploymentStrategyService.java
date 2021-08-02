package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.DeploymentStrategy;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface DeploymentStrategyService {

    @GET("deploymentStrategy")
    Call<TypeCollection<DeploymentStrategy>> list();

    @GET("deploymentStrategy")
    Call<TypeCollection<DeploymentStrategy>> list(@QueryMap Filters filters);

    @GET("deploymentStrategy/{id}")
    Call<DeploymentStrategy> get(@Path("id") String id);

    @POST("deploymentStrategy")
    Call<DeploymentStrategy> create(@Body DeploymentStrategy deploymentStrategy);

    @PUT("deploymentStrategy/{id}")
    Call<DeploymentStrategy> update(@Path("id") String id, @Body DeploymentStrategy deploymentStrategy);

    @DELETE("deploymentStrategy/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
