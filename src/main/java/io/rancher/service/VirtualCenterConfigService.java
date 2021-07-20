package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.VirtualCenterConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface VirtualCenterConfigService {

    @GET("virtualCenterConfig")
    Call<TypeCollection<VirtualCenterConfig>> list();

    @GET("virtualCenterConfig")
    Call<TypeCollection<VirtualCenterConfig>> list(@QueryMap Filters filters);

    @GET("virtualCenterConfig/{id}")
    Call<VirtualCenterConfig> get(@Path("id") String id);

    @POST("virtualCenterConfig")
    Call<VirtualCenterConfig> create(@Body VirtualCenterConfig virtualCenterConfig);

    @PUT("virtualCenterConfig/{id}")
    Call<VirtualCenterConfig> update(@Path("id") String id, @Body VirtualCenterConfig virtualCenterConfig);

    @DELETE("virtualCenterConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
