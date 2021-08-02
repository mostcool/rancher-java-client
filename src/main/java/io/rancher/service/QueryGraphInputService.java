package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.QueryGraphInput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface QueryGraphInputService {

    @GET("queryGraphInput")
    Call<TypeCollection<QueryGraphInput>> list();

    @GET("queryGraphInput")
    Call<TypeCollection<QueryGraphInput>> list(@QueryMap Filters filters);

    @GET("queryGraphInput/{id}")
    Call<QueryGraphInput> get(@Path("id") String id);

    @POST("queryGraphInput")
    Call<QueryGraphInput> create(@Body QueryGraphInput queryGraphInput);

    @PUT("queryGraphInput/{id}")
    Call<QueryGraphInput> update(@Path("id") String id, @Body QueryGraphInput queryGraphInput);

    @DELETE("queryGraphInput/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
