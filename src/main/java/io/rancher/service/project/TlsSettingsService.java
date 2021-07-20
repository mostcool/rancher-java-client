package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.TlsSettings;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface TlsSettingsService {

    @GET("tlsSettings")
    Call<TypeCollection<TlsSettings>> list();

    @GET("tlsSettings")
    Call<TypeCollection<TlsSettings>> list(@QueryMap Filters filters);

    @GET("tlsSettings/{id}")
    Call<TlsSettings> get(@Path("id") String id);

    @POST("tlsSettings")
    Call<TlsSettings> create(@Body TlsSettings tlsSettings);

    @PUT("tlsSettings/{id}")
    Call<TlsSettings> update(@Path("id") String id, @Body TlsSettings tlsSettings);

    @DELETE("tlsSettings/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
