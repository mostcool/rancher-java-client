package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.TypedLocalObjectReference;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface TypedLocalObjectReferenceService {

    @GET("typedLocalObjectReference")
    Call<TypeCollection<TypedLocalObjectReference>> list();

    @GET("typedLocalObjectReference")
    Call<TypeCollection<TypedLocalObjectReference>> list(@QueryMap Filters filters);

    @GET("typedLocalObjectReference/{id}")
    Call<TypedLocalObjectReference> get(@Path("id") String id);

    @POST("typedLocalObjectReference")
    Call<TypedLocalObjectReference> create(@Body TypedLocalObjectReference typedLocalObjectReference);

    @PUT("typedLocalObjectReference/{id}")
    Call<TypedLocalObjectReference> update(@Path("id") String id, @Body TypedLocalObjectReference typedLocalObjectReference);

    @DELETE("typedLocalObjectReference/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
