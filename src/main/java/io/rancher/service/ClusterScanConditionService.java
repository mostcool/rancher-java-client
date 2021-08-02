package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterScanCondition;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ClusterScanConditionService {

    @GET("clusterScanCondition")
    Call<TypeCollection<ClusterScanCondition>> list();

    @GET("clusterScanCondition")
    Call<TypeCollection<ClusterScanCondition>> list(@QueryMap Filters filters);

    @GET("clusterScanCondition/{id}")
    Call<ClusterScanCondition> get(@Path("id") String id);

    @POST("clusterScanCondition")
    Call<ClusterScanCondition> create(@Body ClusterScanCondition clusterScanCondition);

    @PUT("clusterScanCondition/{id}")
    Call<ClusterScanCondition> update(@Path("id") String id, @Body ClusterScanCondition clusterScanCondition);

    @DELETE("clusterScanCondition/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
