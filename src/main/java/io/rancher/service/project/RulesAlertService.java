package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.RulesAlert;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

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
    Call<Response> delete(@Path("id") String id);
    
}
