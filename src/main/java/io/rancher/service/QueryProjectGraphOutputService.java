package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.QueryProjectGraphOutput;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface QueryProjectGraphOutputService {

    @GET("queryProjectGraphOutput")
    Call<TypeCollection<QueryProjectGraphOutput>> list();

    @GET("queryProjectGraphOutput")
    Call<TypeCollection<QueryProjectGraphOutput>> list(@QueryMap Filters filters);

    @GET("queryProjectGraphOutput/{id}")
    Call<QueryProjectGraphOutput> get(@Path("id") String id);

    @POST("queryProjectGraphOutput")
    Call<QueryProjectGraphOutput> create(@Body QueryProjectGraphOutput queryProjectGraphOutput);

    @PUT("queryProjectGraphOutput/{id}")
    Call<QueryProjectGraphOutput> update(@Path("id") String id, @Body QueryProjectGraphOutput queryProjectGraphOutput);

    @DELETE("queryProjectGraphOutput/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
