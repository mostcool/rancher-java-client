package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ConnectionPoolSettings;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ConnectionPoolSettingsService {

    @GET("connectionPoolSettings")
    Call<TypeCollection<ConnectionPoolSettings>> list();

    @GET("connectionPoolSettings")
    Call<TypeCollection<ConnectionPoolSettings>> list(@QueryMap Filters filters);

    @GET("connectionPoolSettings/{id}")
    Call<ConnectionPoolSettings> get(@Path("id") String id);

    @POST("connectionPoolSettings")
    Call<ConnectionPoolSettings> create(@Body ConnectionPoolSettings connectionPoolSettings);

    @PUT("connectionPoolSettings/{id}")
    Call<ConnectionPoolSettings> update(@Path("id") String id, @Body ConnectionPoolSettings connectionPoolSettings);

    @DELETE("connectionPoolSettings/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
