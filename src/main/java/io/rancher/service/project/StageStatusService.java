package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.StageStatus;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface StageStatusService {

    @GET("stageStatus")
    Call<TypeCollection<StageStatus>> list();

    @GET("stageStatus")
    Call<TypeCollection<StageStatus>> list(@QueryMap Filters filters);

    @GET("stageStatus/{id}")
    Call<StageStatus> get(@Path("id") String id);

    @POST("stageStatus")
    Call<StageStatus> create(@Body StageStatus stageStatus);

    @PUT("stageStatus/{id}")
    Call<StageStatus> update(@Path("id") String id, @Body StageStatus stageStatus);

    @DELETE("stageStatus/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
