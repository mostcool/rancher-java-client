package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.PolicyRule;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

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
    Call<ResponseBody> delete(@Path("id") String id);
}
