package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PodDNSConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PodDNSConfigService {

    @GET("podDNSConfig")
    Call<TypeCollection<PodDNSConfig>> list();

    @GET("podDNSConfig")
    Call<TypeCollection<PodDNSConfig>> list(@QueryMap Filters filters);

    @GET("podDNSConfig/{id}")
    Call<PodDNSConfig> get(@Path("id") String id);

    @POST("podDNSConfig")
    Call<PodDNSConfig> create(@Body PodDNSConfig podDNSConfig);

    @PUT("podDNSConfig/{id}")
    Call<PodDNSConfig> update(@Path("id") String id, @Body PodDNSConfig podDNSConfig);

    @DELETE("podDNSConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
