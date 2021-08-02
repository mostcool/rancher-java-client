package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.HttpIngressPath;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface HttpIngressPathService {

    @GET("httpIngressPath")
    Call<TypeCollection<HttpIngressPath>> list();

    @GET("httpIngressPath")
    Call<TypeCollection<HttpIngressPath>> list(@QueryMap Filters filters);

    @GET("httpIngressPath/{id}")
    Call<HttpIngressPath> get(@Path("id") String id);

    @POST("httpIngressPath")
    Call<HttpIngressPath> create(@Body HttpIngressPath httpIngressPath);

    @PUT("httpIngressPath/{id}")
    Call<HttpIngressPath> update(@Path("id") String id, @Body HttpIngressPath httpIngressPath);

    @DELETE("httpIngressPath/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
