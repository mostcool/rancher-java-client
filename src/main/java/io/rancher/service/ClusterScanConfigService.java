package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterScanConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ClusterScanConfigService {

    @GET("clusterScanConfig")
    Call<TypeCollection<ClusterScanConfig>> list();

    @GET("clusterScanConfig")
    Call<TypeCollection<ClusterScanConfig>> list(@QueryMap Filters filters);

    @GET("clusterScanConfig/{id}")
    Call<ClusterScanConfig> get(@Path("id") String id);

    @POST("clusterScanConfig")
    Call<ClusterScanConfig> create(@Body ClusterScanConfig clusterScanConfig);

    @PUT("clusterScanConfig/{id}")
    Call<ClusterScanConfig> update(@Path("id") String id, @Body ClusterScanConfig clusterScanConfig);

    @DELETE("clusterScanConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
