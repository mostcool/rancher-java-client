package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.NamespacedBasicAuth;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface NamespacedBasicAuthService {

    @GET("namespacedBasicAuth")
    Call<TypeCollection<NamespacedBasicAuth>> list();

    @GET("namespacedBasicAuth")
    Call<TypeCollection<NamespacedBasicAuth>> list(@QueryMap Filters filters);

    @GET("namespacedBasicAuth/{id}")
    Call<NamespacedBasicAuth> get(@Path("id") String id);

    @POST("namespacedBasicAuth")
    Call<NamespacedBasicAuth> create(@Body NamespacedBasicAuth namespacedBasicAuth);

    @PUT("namespacedBasicAuth/{id}")
    Call<NamespacedBasicAuth> update(@Path("id") String id, @Body NamespacedBasicAuth namespacedBasicAuth);

    @DELETE("namespacedBasicAuth/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
