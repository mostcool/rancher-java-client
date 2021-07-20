package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Pipeline;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface PipelineService {

    @GET("pipeline")
    Call<TypeCollection<Pipeline>> list();

    @GET("pipeline")
    Call<TypeCollection<Pipeline>> list(@QueryMap Filters filters);

    @GET("pipeline/{id}")
    Call<Pipeline> get(@Path("id") String id);

    @POST("pipeline")
    Call<Pipeline> create(@Body Pipeline pipeline);

    @PUT("pipeline/{id}")
    Call<Pipeline> update(@Path("id") String id, @Body Pipeline pipeline);

    @DELETE("pipeline/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
