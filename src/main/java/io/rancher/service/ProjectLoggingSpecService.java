package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ProjectLoggingSpec;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ProjectLoggingSpecService {

    @GET("projectLoggingSpec")
    Call<TypeCollection<ProjectLoggingSpec>> list();

    @GET("projectLoggingSpec")
    Call<TypeCollection<ProjectLoggingSpec>> list(@QueryMap Filters filters);

    @GET("projectLoggingSpec/{id}")
    Call<ProjectLoggingSpec> get(@Path("id") String id);

    @POST("projectLoggingSpec")
    Call<ProjectLoggingSpec> create(@Body ProjectLoggingSpec projectLoggingSpec);

    @PUT("projectLoggingSpec/{id}")
    Call<ProjectLoggingSpec> update(@Path("id") String id, @Body ProjectLoggingSpec projectLoggingSpec);

    @DELETE("projectLoggingSpec/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
