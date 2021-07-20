package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.RelabelConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface RelabelConfigService {

    @GET("relabelConfig")
    Call<TypeCollection<RelabelConfig>> list();

    @GET("relabelConfig")
    Call<TypeCollection<RelabelConfig>> list(@QueryMap Filters filters);

    @GET("relabelConfig/{id}")
    Call<RelabelConfig> get(@Path("id") String id);

    @POST("relabelConfig")
    Call<RelabelConfig> create(@Body RelabelConfig relabelConfig);

    @PUT("relabelConfig/{id}")
    Call<RelabelConfig> update(@Path("id") String id, @Body RelabelConfig relabelConfig);

    @DELETE("relabelConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
