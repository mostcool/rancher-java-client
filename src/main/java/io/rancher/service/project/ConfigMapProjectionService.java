package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ConfigMapProjection;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ConfigMapProjectionService {

    @GET("configMapProjection")
    Call<TypeCollection<ConfigMapProjection>> list();

    @GET("configMapProjection")
    Call<TypeCollection<ConfigMapProjection>> list(@QueryMap Filters filters);

    @GET("configMapProjection/{id}")
    Call<ConfigMapProjection> get(@Path("id") String id);

    @POST("configMapProjection")
    Call<ConfigMapProjection> create(@Body ConfigMapProjection configMapProjection);

    @PUT("configMapProjection/{id}")
    Call<ConfigMapProjection> update(@Path("id") String id, @Body ConfigMapProjection configMapProjection);

    @DELETE("configMapProjection/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
