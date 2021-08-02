package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.IngressConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface IngressConfigService {

    @GET("ingressConfig")
    Call<TypeCollection<IngressConfig>> list();

    @GET("ingressConfig")
    Call<TypeCollection<IngressConfig>> list(@QueryMap Filters filters);

    @GET("ingressConfig/{id}")
    Call<IngressConfig> get(@Path("id") String id);

    @POST("ingressConfig")
    Call<IngressConfig> create(@Body IngressConfig ingressConfig);

    @PUT("ingressConfig/{id}")
    Call<IngressConfig> update(@Path("id") String id, @Body IngressConfig ingressConfig);

    @DELETE("ingressConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
