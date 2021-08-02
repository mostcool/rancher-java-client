package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Rule;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface RuleService {

    @GET("rule")
    Call<TypeCollection<Rule>> list();

    @GET("rule")
    Call<TypeCollection<Rule>> list(@QueryMap Filters filters);

    @GET("rule/{id}")
    Call<Rule> get(@Path("id") String id);

    @POST("rule")
    Call<Rule> create(@Body Rule rule);

    @PUT("rule/{id}")
    Call<Rule> update(@Path("id") String id, @Body Rule rule);

    @DELETE("rule/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
