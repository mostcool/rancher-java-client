package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ResourceFieldSelector;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ResourceFieldSelectorService {

    @GET("resourceFieldSelector")
    Call<TypeCollection<ResourceFieldSelector>> list();

    @GET("resourceFieldSelector")
    Call<TypeCollection<ResourceFieldSelector>> list(@QueryMap Filters filters);

    @GET("resourceFieldSelector/{id}")
    Call<ResourceFieldSelector> get(@Path("id") String id);

    @POST("resourceFieldSelector")
    Call<ResourceFieldSelector> create(@Body ResourceFieldSelector resourceFieldSelector);

    @PUT("resourceFieldSelector/{id}")
    Call<ResourceFieldSelector> update(@Path("id") String id, @Body ResourceFieldSelector resourceFieldSelector);

    @DELETE("resourceFieldSelector/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
