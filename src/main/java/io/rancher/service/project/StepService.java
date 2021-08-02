package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Step;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface StepService {

    @GET("step")
    Call<TypeCollection<Step>> list();

    @GET("step")
    Call<TypeCollection<Step>> list(@QueryMap Filters filters);

    @GET("step/{id}")
    Call<Step> get(@Path("id") String id);

    @POST("step")
    Call<Step> create(@Body Step step);

    @PUT("step/{id}")
    Call<Step> update(@Path("id") String id, @Body Step step);

    @DELETE("step/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
