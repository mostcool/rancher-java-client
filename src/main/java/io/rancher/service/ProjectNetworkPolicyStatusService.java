package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ProjectNetworkPolicyStatus;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ProjectNetworkPolicyStatusService {

    @GET("projectNetworkPolicyStatus")
    Call<TypeCollection<ProjectNetworkPolicyStatus>> list();

    @GET("projectNetworkPolicyStatus")
    Call<TypeCollection<ProjectNetworkPolicyStatus>> list(@QueryMap Filters filters);

    @GET("projectNetworkPolicyStatus/{id}")
    Call<ProjectNetworkPolicyStatus> get(@Path("id") String id);

    @POST("projectNetworkPolicyStatus")
    Call<ProjectNetworkPolicyStatus> create(@Body ProjectNetworkPolicyStatus projectNetworkPolicyStatus);

    @PUT("projectNetworkPolicyStatus/{id}")
    Call<ProjectNetworkPolicyStatus> update(@Path("id") String id, @Body ProjectNetworkPolicyStatus projectNetworkPolicyStatus);

    @DELETE("projectNetworkPolicyStatus/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
