package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterScanStatus;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ClusterScanStatusService {

    @GET("clusterScanStatus")
    Call<TypeCollection<ClusterScanStatus>> list();

    @GET("clusterScanStatus")
    Call<TypeCollection<ClusterScanStatus>> list(@QueryMap Filters filters);

    @GET("clusterScanStatus/{id}")
    Call<ClusterScanStatus> get(@Path("id") String id);

    @POST("clusterScanStatus")
    Call<ClusterScanStatus> create(@Body ClusterScanStatus clusterScanStatus);

    @PUT("clusterScanStatus/{id}")
    Call<ClusterScanStatus> update(@Path("id") String id, @Body ClusterScanStatus clusterScanStatus);

    @DELETE("clusterScanStatus/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
