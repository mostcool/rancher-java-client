package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.HttpRedirect;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface HttpRedirectService {

    @GET("httpRedirect")
    Call<TypeCollection<HttpRedirect>> list();

    @GET("httpRedirect")
    Call<TypeCollection<HttpRedirect>> list(@QueryMap Filters filters);

    @GET("httpRedirect/{id}")
    Call<HttpRedirect> get(@Path("id") String id);

    @POST("httpRedirect")
    Call<HttpRedirect> create(@Body HttpRedirect httpRedirect);

    @PUT("httpRedirect/{id}")
    Call<HttpRedirect> update(@Path("id") String id, @Body HttpRedirect httpRedirect);

    @DELETE("httpRedirect/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
