package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Metric;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface MetricService {

    @GET("metric")
    Call<TypeCollection<Metric>> list();

    @GET("metric")
    Call<TypeCollection<Metric>> list(@QueryMap Filters filters);

    @GET("metric/{id}")
    Call<Metric> get(@Path("id") String id);

    @POST("metric")
    Call<Metric> create(@Body Metric metric);

    @PUT("metric/{id}")
    Call<Metric> update(@Path("id") String id, @Body Metric metric);

    @DELETE("metric/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
