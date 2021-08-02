package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.AppCondition;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AppConditionService {

    @GET("appCondition")
    Call<TypeCollection<AppCondition>> list();

    @GET("appCondition")
    Call<TypeCollection<AppCondition>> list(@QueryMap Filters filters);

    @GET("appCondition/{id}")
    Call<AppCondition> get(@Path("id") String id);

    @POST("appCondition")
    Call<AppCondition> create(@Body AppCondition appCondition);

    @PUT("appCondition/{id}")
    Call<AppCondition> update(@Path("id") String id, @Body AppCondition appCondition);

    @DELETE("appCondition/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
