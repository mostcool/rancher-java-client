package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.AppUpgradeConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AppUpgradeConfigService {

    @GET("appUpgradeConfig")
    Call<TypeCollection<AppUpgradeConfig>> list();

    @GET("appUpgradeConfig")
    Call<TypeCollection<AppUpgradeConfig>> list(@QueryMap Filters filters);

    @GET("appUpgradeConfig/{id}")
    Call<AppUpgradeConfig> get(@Path("id") String id);

    @POST("appUpgradeConfig")
    Call<AppUpgradeConfig> create(@Body AppUpgradeConfig appUpgradeConfig);

    @PUT("appUpgradeConfig/{id}")
    Call<AppUpgradeConfig> update(@Path("id") String id, @Body AppUpgradeConfig appUpgradeConfig);

    @DELETE("appUpgradeConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
