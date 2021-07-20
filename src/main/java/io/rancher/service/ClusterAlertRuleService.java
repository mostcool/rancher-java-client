package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterAlertRule;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

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
    Call<Response> delete(@Path("id") String id);
    
}
