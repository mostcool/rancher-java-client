package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.QueryClusterMetricInput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface QueryClusterMetricInputService {

    @GET("queryClusterMetricInput")
    Call<TypeCollection<QueryClusterMetricInput>> list();

    @GET("queryClusterMetricInput")
    Call<TypeCollection<QueryClusterMetricInput>> list(@QueryMap Filters filters);

    @GET("queryClusterMetricInput/{id}")
    Call<QueryClusterMetricInput> get(@Path("id") String id);

    @POST("queryClusterMetricInput")
    Call<QueryClusterMetricInput> create(@Body QueryClusterMetricInput queryClusterMetricInput);

    @PUT("queryClusterMetricInput/{id}")
    Call<QueryClusterMetricInput> update(@Path("id") String id, @Body QueryClusterMetricInput queryClusterMetricInput);

    @DELETE("queryClusterMetricInput/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
