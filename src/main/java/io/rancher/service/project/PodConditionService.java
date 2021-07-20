package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PodCondition;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PodConditionService {

    @GET("podCondition")
    Call<TypeCollection<PodCondition>> list();

    @GET("podCondition")
    Call<TypeCollection<PodCondition>> list(@QueryMap Filters filters);

    @GET("podCondition/{id}")
    Call<PodCondition> get(@Path("id") String id);

    @POST("podCondition")
    Call<PodCondition> create(@Body PodCondition podCondition);

    @PUT("podCondition/{id}")
    Call<PodCondition> update(@Path("id") String id, @Body PodCondition podCondition);

    @DELETE("podCondition/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
