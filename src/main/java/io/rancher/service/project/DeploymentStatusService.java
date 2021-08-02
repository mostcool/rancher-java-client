package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.DeploymentStatus;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface DeploymentStatusService {

    @GET("deploymentStatus")
    Call<TypeCollection<DeploymentStatus>> list();

    @GET("deploymentStatus")
    Call<TypeCollection<DeploymentStatus>> list(@QueryMap Filters filters);

    @GET("deploymentStatus/{id}")
    Call<DeploymentStatus> get(@Path("id") String id);

    @POST("deploymentStatus")
    Call<DeploymentStatus> create(@Body DeploymentStatus deploymentStatus);

    @PUT("deploymentStatus/{id}")
    Call<DeploymentStatus> update(@Path("id") String id, @Body DeploymentStatus deploymentStatus);

    @DELETE("deploymentStatus/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
