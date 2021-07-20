package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ConfigMap;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ConfigMapService {

    @GET("configMap")
    Call<TypeCollection<ConfigMap>> list();

    @GET("configMap")
    Call<TypeCollection<ConfigMap>> list(@QueryMap Filters filters);

    @GET("configMap/{id}")
    Call<ConfigMap> get(@Path("id") String id);

    @POST("configMap")
    Call<ConfigMap> create(@Body ConfigMap configMap);

    @PUT("configMap/{id}")
    Call<ConfigMap> update(@Path("id") String id, @Body ConfigMap configMap);

    @DELETE("configMap/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
