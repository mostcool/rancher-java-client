package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.QueryClusterGraphOutput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface QueryClusterGraphOutputService {

    @GET("queryClusterGraphOutput")
    Call<TypeCollection<QueryClusterGraphOutput>> list();

    @GET("queryClusterGraphOutput")
    Call<TypeCollection<QueryClusterGraphOutput>> list(@QueryMap Filters filters);

    @GET("queryClusterGraphOutput/{id}")
    Call<QueryClusterGraphOutput> get(@Path("id") String id);

    @POST("queryClusterGraphOutput")
    Call<QueryClusterGraphOutput> create(@Body QueryClusterGraphOutput queryClusterGraphOutput);

    @PUT("queryClusterGraphOutput/{id}")
    Call<QueryClusterGraphOutput> update(@Path("id") String id, @Body QueryClusterGraphOutput queryClusterGraphOutput);

    @DELETE("queryClusterGraphOutput/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
