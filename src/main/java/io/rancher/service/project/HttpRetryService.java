package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.HttpRetry;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface HttpRetryService {

    @GET("httpRetry")
    Call<TypeCollection<HttpRetry>> list();

    @GET("httpRetry")
    Call<TypeCollection<HttpRetry>> list(@QueryMap Filters filters);

    @GET("httpRetry/{id}")
    Call<HttpRetry> get(@Path("id") String id);

    @POST("httpRetry")
    Call<HttpRetry> create(@Body HttpRetry httpRetry);

    @PUT("httpRetry/{id}")
    Call<HttpRetry> update(@Path("id") String id, @Body HttpRetry httpRetry);

    @DELETE("httpRetry/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
