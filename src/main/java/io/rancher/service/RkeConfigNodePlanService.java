package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RkeConfigNodePlan;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface RkeConfigNodePlanService {

    @GET("rkeConfigNodePlan")
    Call<TypeCollection<RkeConfigNodePlan>> list();

    @GET("rkeConfigNodePlan")
    Call<TypeCollection<RkeConfigNodePlan>> list(@QueryMap Filters filters);

    @GET("rkeConfigNodePlan/{id}")
    Call<RkeConfigNodePlan> get(@Path("id") String id);

    @POST("rkeConfigNodePlan")
    Call<RkeConfigNodePlan> create(@Body RkeConfigNodePlan rkeConfigNodePlan);

    @PUT("rkeConfigNodePlan/{id}")
    Call<RkeConfigNodePlan> update(@Path("id") String id, @Body RkeConfigNodePlan rkeConfigNodePlan);

    @DELETE("rkeConfigNodePlan/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
