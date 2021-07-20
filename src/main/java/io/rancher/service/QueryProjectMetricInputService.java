package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.QueryProjectMetricInput;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface QueryProjectMetricInputService {

    @GET("queryProjectMetricInput")
    Call<TypeCollection<QueryProjectMetricInput>> list();

    @GET("queryProjectMetricInput")
    Call<TypeCollection<QueryProjectMetricInput>> list(@QueryMap Filters filters);

    @GET("queryProjectMetricInput/{id}")
    Call<QueryProjectMetricInput> get(@Path("id") String id);

    @POST("queryProjectMetricInput")
    Call<QueryProjectMetricInput> create(@Body QueryProjectMetricInput queryProjectMetricInput);

    @PUT("queryProjectMetricInput/{id}")
    Call<QueryProjectMetricInput> update(@Path("id") String id, @Body QueryProjectMetricInput queryProjectMetricInput);

    @DELETE("queryProjectMetricInput/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
