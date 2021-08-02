package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.ApiServiceCondition;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ApiServiceConditionService {

    @GET("apiServiceCondition")
    Call<TypeCollection<ApiServiceCondition>> list();

    @GET("apiServiceCondition")
    Call<TypeCollection<ApiServiceCondition>> list(@QueryMap Filters filters);

    @GET("apiServiceCondition/{id}")
    Call<ApiServiceCondition> get(@Path("id") String id);

    @POST("apiServiceCondition")
    Call<ApiServiceCondition> create(@Body ApiServiceCondition apiServiceCondition);

    @PUT("apiServiceCondition/{id}")
    Call<ApiServiceCondition> update(@Path("id") String id, @Body ApiServiceCondition apiServiceCondition);

    @DELETE("apiServiceCondition/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
