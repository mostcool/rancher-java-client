package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PipelineCondition;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PipelineConditionService {

    @GET("pipelineCondition")
    Call<TypeCollection<PipelineCondition>> list();

    @GET("pipelineCondition")
    Call<TypeCollection<PipelineCondition>> list(@QueryMap Filters filters);

    @GET("pipelineCondition/{id}")
    Call<PipelineCondition> get(@Path("id") String id);

    @POST("pipelineCondition")
    Call<PipelineCondition> create(@Body PipelineCondition pipelineCondition);

    @PUT("pipelineCondition/{id}")
    Call<PipelineCondition> update(@Path("id") String id, @Body PipelineCondition pipelineCondition);

    @DELETE("pipelineCondition/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
