package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SeLinuxStrategyOptions;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface SeLinuxStrategyOptionsService {

    @GET("seLinuxStrategyOptions")
    Call<TypeCollection<SeLinuxStrategyOptions>> list();

    @GET("seLinuxStrategyOptions")
    Call<TypeCollection<SeLinuxStrategyOptions>> list(@QueryMap Filters filters);

    @GET("seLinuxStrategyOptions/{id}")
    Call<SeLinuxStrategyOptions> get(@Path("id") String id);

    @POST("seLinuxStrategyOptions")
    Call<SeLinuxStrategyOptions> create(@Body SeLinuxStrategyOptions seLinuxStrategyOptions);

    @PUT("seLinuxStrategyOptions/{id}")
    Call<SeLinuxStrategyOptions> update(@Path("id") String id, @Body SeLinuxStrategyOptions seLinuxStrategyOptions);

    @DELETE("seLinuxStrategyOptions/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
