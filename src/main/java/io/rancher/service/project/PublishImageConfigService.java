package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PublishImageConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface PublishImageConfigService {

    @GET("publishImageConfig")
    Call<TypeCollection<PublishImageConfig>> list();

    @GET("publishImageConfig")
    Call<TypeCollection<PublishImageConfig>> list(@QueryMap Filters filters);

    @GET("publishImageConfig/{id}")
    Call<PublishImageConfig> get(@Path("id") String id);

    @POST("publishImageConfig")
    Call<PublishImageConfig> create(@Body PublishImageConfig publishImageConfig);

    @PUT("publishImageConfig/{id}")
    Call<PublishImageConfig> update(@Path("id") String id, @Body PublishImageConfig publishImageConfig);

    @DELETE("publishImageConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
