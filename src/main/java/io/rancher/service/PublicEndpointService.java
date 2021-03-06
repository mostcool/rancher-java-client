package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.PublicEndpoint;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PublicEndpointService {

    @GET("publicEndpoint")
    Call<TypeCollection<PublicEndpoint>> list();

    @GET("publicEndpoint")
    Call<TypeCollection<PublicEndpoint>> list(@QueryMap Filters filters);

    @GET("publicEndpoint/{id}")
    Call<PublicEndpoint> get(@Path("id") String id);

    @POST("publicEndpoint")
    Call<PublicEndpoint> create(@Body PublicEndpoint publicEndpoint);

    @PUT("publicEndpoint/{id}")
    Call<PublicEndpoint> update(@Path("id") String id, @Body PublicEndpoint publicEndpoint);

    @DELETE("publicEndpoint/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
