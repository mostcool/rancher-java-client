package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.QueryMetricOutput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface QueryMetricOutputService {

    @GET("queryMetricOutput")
    Call<TypeCollection<QueryMetricOutput>> list();

    @GET("queryMetricOutput")
    Call<TypeCollection<QueryMetricOutput>> list(@QueryMap Filters filters);

    @GET("queryMetricOutput/{id}")
    Call<QueryMetricOutput> get(@Path("id") String id);

    @POST("queryMetricOutput")
    Call<QueryMetricOutput> create(@Body QueryMetricOutput queryMetricOutput);

    @PUT("queryMetricOutput/{id}")
    Call<QueryMetricOutput> update(@Path("id") String id, @Body QueryMetricOutput queryMetricOutput);

    @DELETE("queryMetricOutput/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
