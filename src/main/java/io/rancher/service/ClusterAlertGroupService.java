package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterAlertGroup;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

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
    Call<Response> delete(@Path("id") String id);
    
}
