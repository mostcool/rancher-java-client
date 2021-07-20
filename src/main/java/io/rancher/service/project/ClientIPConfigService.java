package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ClientIPConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ClientIPConfigService {

    @GET("clientIPConfig")
    Call<TypeCollection<ClientIPConfig>> list();

    @GET("clientIPConfig")
    Call<TypeCollection<ClientIPConfig>> list(@QueryMap Filters filters);

    @GET("clientIPConfig/{id}")
    Call<ClientIPConfig> get(@Path("id") String id);

    @POST("clientIPConfig")
    Call<ClientIPConfig> create(@Body ClientIPConfig clientIPConfig);

    @PUT("clientIPConfig/{id}")
    Call<ClientIPConfig> update(@Path("id") String id, @Body ClientIPConfig clientIPConfig);

    @DELETE("clientIPConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
