package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterAlert;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ClusterAlertService {

    @GET("clusterAlert")
    Call<TypeCollection<ClusterAlert>> list();

    @GET("clusterAlert")
    Call<TypeCollection<ClusterAlert>> list(@QueryMap Filters filters);

    @GET("clusterAlert/{id}")
    Call<ClusterAlert> get(@Path("id") String id);

    @POST("clusterAlert")
    Call<ClusterAlert> create(@Body ClusterAlert clusterAlert);

    @PUT("clusterAlert/{id}")
    Call<ClusterAlert> update(@Path("id") String id, @Body ClusterAlert clusterAlert);

    @DELETE("clusterAlert/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
