package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.HttpMatchRequest;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface HttpMatchRequestService {

    @GET("httpMatchRequest")
    Call<TypeCollection<HttpMatchRequest>> list();

    @GET("httpMatchRequest")
    Call<TypeCollection<HttpMatchRequest>> list(@QueryMap Filters filters);

    @GET("httpMatchRequest/{id}")
    Call<HttpMatchRequest> get(@Path("id") String id);

    @POST("httpMatchRequest")
    Call<HttpMatchRequest> create(@Body HttpMatchRequest httpMatchRequest);

    @PUT("httpMatchRequest/{id}")
    Call<HttpMatchRequest> update(@Path("id") String id, @Body HttpMatchRequest httpMatchRequest);

    @DELETE("httpMatchRequest/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
