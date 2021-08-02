package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.HttpRewrite;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface HttpRewriteService {

    @GET("httpRewrite")
    Call<TypeCollection<HttpRewrite>> list();

    @GET("httpRewrite")
    Call<TypeCollection<HttpRewrite>> list(@QueryMap Filters filters);

    @GET("httpRewrite/{id}")
    Call<HttpRewrite> get(@Path("id") String id);

    @POST("httpRewrite")
    Call<HttpRewrite> create(@Body HttpRewrite httpRewrite);

    @PUT("httpRewrite/{id}")
    Call<HttpRewrite> update(@Path("id") String id, @Body HttpRewrite httpRewrite);

    @DELETE("httpRewrite/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
