package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Lifecycle;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface LifecycleService {

    @GET("lifecycle")
    Call<TypeCollection<Lifecycle>> list();

    @GET("lifecycle")
    Call<TypeCollection<Lifecycle>> list(@QueryMap Filters filters);

    @GET("lifecycle/{id}")
    Call<Lifecycle> get(@Path("id") String id);

    @POST("lifecycle")
    Call<Lifecycle> create(@Body Lifecycle lifecycle);

    @PUT("lifecycle/{id}")
    Call<Lifecycle> update(@Path("id") String id, @Body Lifecycle lifecycle);

    @DELETE("lifecycle/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
