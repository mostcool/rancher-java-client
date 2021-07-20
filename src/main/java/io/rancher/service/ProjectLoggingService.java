package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ProjectLogging;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ProjectLoggingService {

    @GET("projectLogging")
    Call<TypeCollection<ProjectLogging>> list();

    @GET("projectLogging")
    Call<TypeCollection<ProjectLogging>> list(@QueryMap Filters filters);

    @GET("projectLogging/{id}")
    Call<ProjectLogging> get(@Path("id") String id);

    @POST("projectLogging")
    Call<ProjectLogging> create(@Body ProjectLogging projectLogging);

    @PUT("projectLogging/{id}")
    Call<ProjectLogging> update(@Path("id") String id, @Body ProjectLogging projectLogging);

    @DELETE("projectLogging/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
