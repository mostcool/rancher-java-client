package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ProjectAlert;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ProjectAlertService {

    @GET("projectAlert")
    Call<TypeCollection<ProjectAlert>> list();

    @GET("projectAlert")
    Call<TypeCollection<ProjectAlert>> list(@QueryMap Filters filters);

    @GET("projectAlert/{id}")
    Call<ProjectAlert> get(@Path("id") String id);

    @POST("projectAlert")
    Call<ProjectAlert> create(@Body ProjectAlert projectAlert);

    @PUT("projectAlert/{id}")
    Call<ProjectAlert> update(@Path("id") String id, @Body ProjectAlert projectAlert);

    @DELETE("projectAlert/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
