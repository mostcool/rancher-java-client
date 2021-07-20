package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ObjectFieldSelector;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ObjectFieldSelectorService {

    @GET("objectFieldSelector")
    Call<TypeCollection<ObjectFieldSelector>> list();

    @GET("objectFieldSelector")
    Call<TypeCollection<ObjectFieldSelector>> list(@QueryMap Filters filters);

    @GET("objectFieldSelector/{id}")
    Call<ObjectFieldSelector> get(@Path("id") String id);

    @POST("objectFieldSelector")
    Call<ObjectFieldSelector> create(@Body ObjectFieldSelector objectFieldSelector);

    @PUT("objectFieldSelector/{id}")
    Call<ObjectFieldSelector> update(@Path("id") String id, @Body ObjectFieldSelector objectFieldSelector);

    @DELETE("objectFieldSelector/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
