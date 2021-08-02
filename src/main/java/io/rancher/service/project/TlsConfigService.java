package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.TlsConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface TlsConfigService {

    @GET("tlsConfig")
    Call<TypeCollection<TlsConfig>> list();

    @GET("tlsConfig")
    Call<TypeCollection<TlsConfig>> list(@QueryMap Filters filters);

    @GET("tlsConfig/{id}")
    Call<TlsConfig> get(@Path("id") String id);

    @POST("tlsConfig")
    Call<TlsConfig> create(@Body TlsConfig tlsConfig);

    @PUT("tlsConfig/{id}")
    Call<TlsConfig> update(@Path("id") String id, @Body TlsConfig tlsConfig);

    @DELETE("tlsConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
