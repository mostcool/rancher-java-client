package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NodeRule;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface NodeRuleService {

    @GET("nodeRule")
    Call<TypeCollection<NodeRule>> list();

    @GET("nodeRule")
    Call<TypeCollection<NodeRule>> list(@QueryMap Filters filters);

    @GET("nodeRule/{id}")
    Call<NodeRule> get(@Path("id") String id);

    @POST("nodeRule")
    Call<NodeRule> create(@Body NodeRule nodeRule);

    @PUT("nodeRule/{id}")
    Call<NodeRule> update(@Path("id") String id, @Body NodeRule nodeRule);

    @DELETE("nodeRule/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
