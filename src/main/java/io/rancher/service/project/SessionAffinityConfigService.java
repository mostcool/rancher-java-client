package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.SessionAffinityConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface SessionAffinityConfigService {

    @GET("sessionAffinityConfig")
    Call<TypeCollection<SessionAffinityConfig>> list();

    @GET("sessionAffinityConfig")
    Call<TypeCollection<SessionAffinityConfig>> list(@QueryMap Filters filters);

    @GET("sessionAffinityConfig/{id}")
    Call<SessionAffinityConfig> get(@Path("id") String id);

    @POST("sessionAffinityConfig")
    Call<SessionAffinityConfig> create(@Body SessionAffinityConfig sessionAffinityConfig);

    @PUT("sessionAffinityConfig/{id}")
    Call<SessionAffinityConfig> update(@Path("id") String id, @Body SessionAffinityConfig sessionAffinityConfig);

    @DELETE("sessionAffinityConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
