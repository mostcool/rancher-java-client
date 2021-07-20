package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Prometheus;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

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
    Call<Response> delete(@Path("id") String id);
    
}
