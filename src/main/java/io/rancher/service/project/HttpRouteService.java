package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.HttpRoute;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface HttpRouteService {

    @GET("httpRoute")
    Call<TypeCollection<HttpRoute>> list();

    @GET("httpRoute")
    Call<TypeCollection<HttpRoute>> list(@QueryMap Filters filters);

    @GET("httpRoute/{id}")
    Call<HttpRoute> get(@Path("id") String id);

    @POST("httpRoute")
    Call<HttpRoute> create(@Body HttpRoute httpRoute);

    @PUT("httpRoute/{id}")
    Call<HttpRoute> update(@Path("id") String id, @Body HttpRoute httpRoute);

    @DELETE("httpRoute/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
