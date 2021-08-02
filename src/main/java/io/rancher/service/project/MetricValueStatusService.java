package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.MetricValueStatus;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface MetricValueStatusService {

    @GET("metricValueStatus")
    Call<TypeCollection<MetricValueStatus>> list();

    @GET("metricValueStatus")
    Call<TypeCollection<MetricValueStatus>> list(@QueryMap Filters filters);

    @GET("metricValueStatus/{id}")
    Call<MetricValueStatus> get(@Path("id") String id);

    @POST("metricValueStatus")
    Call<MetricValueStatus> create(@Body MetricValueStatus metricValueStatus);

    @PUT("metricValueStatus/{id}")
    Call<MetricValueStatus> update(@Path("id") String id, @Body MetricValueStatus metricValueStatus);

    @DELETE("metricValueStatus/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
