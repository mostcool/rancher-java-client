package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.AppRevisionStatus;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface AppRevisionStatusService {

    @GET("appRevisionStatus")
    Call<TypeCollection<AppRevisionStatus>> list();

    @GET("appRevisionStatus")
    Call<TypeCollection<AppRevisionStatus>> list(@QueryMap Filters filters);

    @GET("appRevisionStatus/{id}")
    Call<AppRevisionStatus> get(@Path("id") String id);

    @POST("appRevisionStatus")
    Call<AppRevisionStatus> create(@Body AppRevisionStatus appRevisionStatus);

    @PUT("appRevisionStatus/{id}")
    Call<AppRevisionStatus> update(@Path("id") String id, @Body AppRevisionStatus appRevisionStatus);

    @DELETE("appRevisionStatus/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
