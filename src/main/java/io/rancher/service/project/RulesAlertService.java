package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.RulesAlert;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface RulesAlertService {

    @GET("rulesAlert")
    Call<TypeCollection<RulesAlert>> list();

    @GET("rulesAlert")
    Call<TypeCollection<RulesAlert>> list(@QueryMap Filters filters);

    @GET("rulesAlert/{id}")
    Call<RulesAlert> get(@Path("id") String id);

    @POST("rulesAlert")
    Call<RulesAlert> create(@Body RulesAlert rulesAlert);

    @PUT("rulesAlert/{id}")
    Call<RulesAlert> update(@Path("id") String id, @Body RulesAlert rulesAlert);

    @DELETE("rulesAlert/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
