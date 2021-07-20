package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.PolicyRule;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PolicyRuleService {

    @GET("policyRule")
    Call<TypeCollection<PolicyRule>> list();

    @GET("policyRule")
    Call<TypeCollection<PolicyRule>> list(@QueryMap Filters filters);

    @GET("policyRule/{id}")
    Call<PolicyRule> get(@Path("id") String id);

    @POST("policyRule")
    Call<PolicyRule> create(@Body PolicyRule policyRule);

    @PUT("policyRule/{id}")
    Call<PolicyRule> update(@Path("id") String id, @Body PolicyRule policyRule);

    @DELETE("policyRule/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
