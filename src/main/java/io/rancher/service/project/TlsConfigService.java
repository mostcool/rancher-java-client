package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.TlsConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

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
    Call<Response> delete(@Path("id") String id);
    
}
