package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Prometheus;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PrometheusService {

    @GET("prometheus")
    Call<TypeCollection<Prometheus>> list();

    @GET("prometheus")
    Call<TypeCollection<Prometheus>> list(@QueryMap Filters filters);

    @GET("prometheus/{id}")
    Call<Prometheus> get(@Path("id") String id);

    @POST("prometheus")
    Call<Prometheus> create(@Body Prometheus prometheus);

    @PUT("prometheus/{id}")
    Call<Prometheus> update(@Path("id") String id, @Body Prometheus prometheus);

    @DELETE("prometheus/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
