package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.TcpSettings;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface TcpSettingsService {

    @GET("tcpSettings")
    Call<TypeCollection<TcpSettings>> list();

    @GET("tcpSettings")
    Call<TypeCollection<TcpSettings>> list(@QueryMap Filters filters);

    @GET("tcpSettings/{id}")
    Call<TcpSettings> get(@Path("id") String id);

    @POST("tcpSettings")
    Call<TcpSettings> create(@Body TcpSettings tcpSettings);

    @PUT("tcpSettings/{id}")
    Call<TcpSettings> update(@Path("id") String id, @Body TcpSettings tcpSettings);

    @DELETE("tcpSettings/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
