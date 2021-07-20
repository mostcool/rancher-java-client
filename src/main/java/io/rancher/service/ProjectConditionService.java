package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ProjectCondition;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ProjectConditionService {

    @GET("projectCondition")
    Call<TypeCollection<ProjectCondition>> list();

    @GET("projectCondition")
    Call<TypeCollection<ProjectCondition>> list(@QueryMap Filters filters);

    @GET("projectCondition/{id}")
    Call<ProjectCondition> get(@Path("id") String id);

    @POST("projectCondition")
    Call<ProjectCondition> create(@Body ProjectCondition projectCondition);

    @PUT("projectCondition/{id}")
    Call<ProjectCondition> update(@Path("id") String id, @Body ProjectCondition projectCondition);

    @DELETE("projectCondition/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
