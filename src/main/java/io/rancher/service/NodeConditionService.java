package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NodeCondition;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface NodeConditionService {

    @GET("nodeCondition")
    Call<TypeCollection<NodeCondition>> list();

    @GET("nodeCondition")
    Call<TypeCollection<NodeCondition>> list(@QueryMap Filters filters);

    @GET("nodeCondition/{id}")
    Call<NodeCondition> get(@Path("id") String id);

    @POST("nodeCondition")
    Call<NodeCondition> create(@Body NodeCondition nodeCondition);

    @PUT("nodeCondition/{id}")
    Call<NodeCondition> update(@Path("id") String id, @Body NodeCondition nodeCondition);

    @DELETE("nodeCondition/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
