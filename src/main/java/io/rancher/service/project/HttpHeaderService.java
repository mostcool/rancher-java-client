package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.HttpHeader;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface HttpHeaderService {

    @GET("httpHeader")
    Call<TypeCollection<HttpHeader>> list();

    @GET("httpHeader")
    Call<TypeCollection<HttpHeader>> list(@QueryMap Filters filters);

    @GET("httpHeader/{id}")
    Call<HttpHeader> get(@Path("id") String id);

    @POST("httpHeader")
    Call<HttpHeader> create(@Body HttpHeader httpHeader);

    @PUT("httpHeader/{id}")
    Call<HttpHeader> update(@Path("id") String id, @Body HttpHeader httpHeader);

    @DELETE("httpHeader/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
