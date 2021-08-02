package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ProjectMonitorGraph;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ProjectMonitorGraphService {

    @GET("projectMonitorGraph")
    Call<TypeCollection<ProjectMonitorGraph>> list();

    @GET("projectMonitorGraph")
    Call<TypeCollection<ProjectMonitorGraph>> list(@QueryMap Filters filters);

    @GET("projectMonitorGraph/{id}")
    Call<ProjectMonitorGraph> get(@Path("id") String id);

    @POST("projectMonitorGraph")
    Call<ProjectMonitorGraph> create(@Body ProjectMonitorGraph projectMonitorGraph);

    @PUT("projectMonitorGraph/{id}")
    Call<ProjectMonitorGraph> update(@Path("id") String id, @Body ProjectMonitorGraph projectMonitorGraph);

    @DELETE("projectMonitorGraph/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
