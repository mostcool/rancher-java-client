package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.BasicAuth;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface BasicAuthService {

    @GET("basicAuth")
    Call<TypeCollection<BasicAuth>> list();

    @GET("basicAuth")
    Call<TypeCollection<BasicAuth>> list(@QueryMap Filters filters);

    @GET("basicAuth/{id}")
    Call<BasicAuth> get(@Path("id") String id);

    @POST("basicAuth")
    Call<BasicAuth> create(@Body BasicAuth basicAuth);

    @PUT("basicAuth/{id}")
    Call<BasicAuth> update(@Path("id") String id, @Body BasicAuth basicAuth);

    @DELETE("basicAuth/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
