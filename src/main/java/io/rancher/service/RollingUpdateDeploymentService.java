package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RollingUpdateDeployment;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface RollingUpdateDeploymentService {

    @GET("rollingUpdateDeployment")
    Call<TypeCollection<RollingUpdateDeployment>> list();

    @GET("rollingUpdateDeployment")
    Call<TypeCollection<RollingUpdateDeployment>> list(@QueryMap Filters filters);

    @GET("rollingUpdateDeployment/{id}")
    Call<RollingUpdateDeployment> get(@Path("id") String id);

    @POST("rollingUpdateDeployment")
    Call<RollingUpdateDeployment> create(@Body RollingUpdateDeployment rollingUpdateDeployment);

    @PUT("rollingUpdateDeployment/{id}")
    Call<RollingUpdateDeployment> update(@Path("id") String id, @Body RollingUpdateDeployment rollingUpdateDeployment);

    @DELETE("rollingUpdateDeployment/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
