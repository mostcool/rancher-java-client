package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.RuleGroup;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface RuleGroupService {

    @GET("ruleGroup")
    Call<TypeCollection<RuleGroup>> list();

    @GET("ruleGroup")
    Call<TypeCollection<RuleGroup>> list(@QueryMap Filters filters);

    @GET("ruleGroup/{id}")
    Call<RuleGroup> get(@Path("id") String id);

    @POST("ruleGroup")
    Call<RuleGroup> create(@Body RuleGroup ruleGroup);

    @PUT("ruleGroup/{id}")
    Call<RuleGroup> update(@Path("id") String id, @Body RuleGroup ruleGroup);

    @DELETE("ruleGroup/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
