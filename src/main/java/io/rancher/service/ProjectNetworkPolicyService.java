package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ProjectNetworkPolicy;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ProjectNetworkPolicyService {

    @GET("projectNetworkPolicy")
    Call<TypeCollection<ProjectNetworkPolicy>> list();

    @GET("projectNetworkPolicy")
    Call<TypeCollection<ProjectNetworkPolicy>> list(@QueryMap Filters filters);

    @GET("projectNetworkPolicy/{id}")
    Call<ProjectNetworkPolicy> get(@Path("id") String id);

    @POST("projectNetworkPolicy")
    Call<ProjectNetworkPolicy> create(@Body ProjectNetworkPolicy projectNetworkPolicy);

    @PUT("projectNetworkPolicy/{id}")
    Call<ProjectNetworkPolicy> update(@Path("id") String id, @Body ProjectNetworkPolicy projectNetworkPolicy);

    @DELETE("projectNetworkPolicy/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
