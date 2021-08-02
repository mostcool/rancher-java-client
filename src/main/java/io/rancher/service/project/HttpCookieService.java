package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.HttpCookie;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface HttpCookieService {

    @GET("httpCookie")
    Call<TypeCollection<HttpCookie>> list();

    @GET("httpCookie")
    Call<TypeCollection<HttpCookie>> list(@QueryMap Filters filters);

    @GET("httpCookie/{id}")
    Call<HttpCookie> get(@Path("id") String id);

    @POST("httpCookie")
    Call<HttpCookie> create(@Body HttpCookie httpCookie);

    @PUT("httpCookie/{id}")
    Call<HttpCookie> update(@Path("id") String id, @Body HttpCookie httpCookie);

    @DELETE("httpCookie/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
