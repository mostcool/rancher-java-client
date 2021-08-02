package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ApplyAppConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ApplyAppConfigService {

    @GET("applyAppConfig")
    Call<TypeCollection<ApplyAppConfig>> list();

    @GET("applyAppConfig")
    Call<TypeCollection<ApplyAppConfig>> list(@QueryMap Filters filters);

    @GET("applyAppConfig/{id}")
    Call<ApplyAppConfig> get(@Path("id") String id);

    @POST("applyAppConfig")
    Call<ApplyAppConfig> create(@Body ApplyAppConfig applyAppConfig);

    @PUT("applyAppConfig/{id}")
    Call<ApplyAppConfig> update(@Path("id") String id, @Body ApplyAppConfig applyAppConfig);

    @DELETE("applyAppConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
