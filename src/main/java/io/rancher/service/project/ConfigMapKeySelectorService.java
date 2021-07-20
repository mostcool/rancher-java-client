package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ConfigMapKeySelector;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ConfigMapKeySelectorService {

    @GET("configMapKeySelector")
    Call<TypeCollection<ConfigMapKeySelector>> list();

    @GET("configMapKeySelector")
    Call<TypeCollection<ConfigMapKeySelector>> list(@QueryMap Filters filters);

    @GET("configMapKeySelector/{id}")
    Call<ConfigMapKeySelector> get(@Path("id") String id);

    @POST("configMapKeySelector")
    Call<ConfigMapKeySelector> create(@Body ConfigMapKeySelector configMapKeySelector);

    @PUT("configMapKeySelector/{id}")
    Call<ConfigMapKeySelector> update(@Path("id") String id, @Body ConfigMapKeySelector configMapKeySelector);

    @DELETE("configMapKeySelector/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
