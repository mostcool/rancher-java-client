package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ProjectLoggingStatus;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ProjectLoggingStatusService {

    @GET("projectLoggingStatus")
    Call<TypeCollection<ProjectLoggingStatus>> list();

    @GET("projectLoggingStatus")
    Call<TypeCollection<ProjectLoggingStatus>> list(@QueryMap Filters filters);

    @GET("projectLoggingStatus/{id}")
    Call<ProjectLoggingStatus> get(@Path("id") String id);

    @POST("projectLoggingStatus")
    Call<ProjectLoggingStatus> create(@Body ProjectLoggingStatus projectLoggingStatus);

    @PUT("projectLoggingStatus/{id}")
    Call<ProjectLoggingStatus> update(@Path("id") String id, @Body ProjectLoggingStatus projectLoggingStatus);

    @DELETE("projectLoggingStatus/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
