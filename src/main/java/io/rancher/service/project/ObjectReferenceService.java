package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ObjectReference;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ObjectReferenceService {

    @GET("objectReference")
    Call<TypeCollection<ObjectReference>> list();

    @GET("objectReference")
    Call<TypeCollection<ObjectReference>> list(@QueryMap Filters filters);

    @GET("objectReference/{id}")
    Call<ObjectReference> get(@Path("id") String id);

    @POST("objectReference")
    Call<ObjectReference> create(@Body ObjectReference objectReference);

    @PUT("objectReference/{id}")
    Call<ObjectReference> update(@Path("id") String id, @Body ObjectReference objectReference);

    @DELETE("objectReference/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
