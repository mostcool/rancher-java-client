package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterCondition;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ClusterConditionService {

    @GET("clusterCondition")
    Call<TypeCollection<ClusterCondition>> list();

    @GET("clusterCondition")
    Call<TypeCollection<ClusterCondition>> list(@QueryMap Filters filters);

    @GET("clusterCondition/{id}")
    Call<ClusterCondition> get(@Path("id") String id);

    @POST("clusterCondition")
    Call<ClusterCondition> create(@Body ClusterCondition clusterCondition);

    @PUT("clusterCondition/{id}")
    Call<ClusterCondition> update(@Path("id") String id, @Body ClusterCondition clusterCondition);

    @DELETE("clusterCondition/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
