package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Deployment;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface DeploymentService {

    @GET("deployment")
    Call<TypeCollection<Deployment>> list();

    @GET("deployment")
    Call<TypeCollection<Deployment>> list(@QueryMap Filters filters);

    @GET("deployment/{id}")
    Call<Deployment> get(@Path("id") String id);

    @POST("deployment")
    Call<Deployment> create(@Body Deployment deployment);

    @PUT("deployment/{id}")
    Call<Deployment> update(@Path("id") String id, @Body Deployment deployment);

    @DELETE("deployment/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
