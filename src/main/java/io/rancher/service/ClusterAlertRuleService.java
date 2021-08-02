package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterAlertRule;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ClusterAlertRuleService {

    @GET("clusterAlertRule")
    Call<TypeCollection<ClusterAlertRule>> list();

    @GET("clusterAlertRule")
    Call<TypeCollection<ClusterAlertRule>> list(@QueryMap Filters filters);

    @GET("clusterAlertRule/{id}")
    Call<ClusterAlertRule> get(@Path("id") String id);

    @POST("clusterAlertRule")
    Call<ClusterAlertRule> create(@Body ClusterAlertRule clusterAlertRule);

    @PUT("clusterAlertRule/{id}")
    Call<ClusterAlertRule> update(@Path("id") String id, @Body ClusterAlertRule clusterAlertRule);

    @DELETE("clusterAlertRule/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
