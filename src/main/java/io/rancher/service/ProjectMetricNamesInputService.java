package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ProjectMetricNamesInput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ProjectMetricNamesInputService {

    @GET("projectMetricNamesInput")
    Call<TypeCollection<ProjectMetricNamesInput>> list();

    @GET("projectMetricNamesInput")
    Call<TypeCollection<ProjectMetricNamesInput>> list(@QueryMap Filters filters);

    @GET("projectMetricNamesInput/{id}")
    Call<ProjectMetricNamesInput> get(@Path("id") String id);

    @POST("projectMetricNamesInput")
    Call<ProjectMetricNamesInput> create(@Body ProjectMetricNamesInput projectMetricNamesInput);

    @PUT("projectMetricNamesInput/{id}")
    Call<ProjectMetricNamesInput> update(@Path("id") String id, @Body ProjectMetricNamesInput projectMetricNamesInput);

    @DELETE("projectMetricNamesInput/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
