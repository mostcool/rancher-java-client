package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterAlertGroup;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ClusterAlertGroupService {

    @GET("clusterAlertGroup")
    Call<TypeCollection<ClusterAlertGroup>> list();

    @GET("clusterAlertGroup")
    Call<TypeCollection<ClusterAlertGroup>> list(@QueryMap Filters filters);

    @GET("clusterAlertGroup/{id}")
    Call<ClusterAlertGroup> get(@Path("id") String id);

    @POST("clusterAlertGroup")
    Call<ClusterAlertGroup> create(@Body ClusterAlertGroup clusterAlertGroup);

    @PUT("clusterAlertGroup/{id}")
    Call<ClusterAlertGroup> update(@Path("id") String id, @Body ClusterAlertGroup clusterAlertGroup);

    @DELETE("clusterAlertGroup/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
