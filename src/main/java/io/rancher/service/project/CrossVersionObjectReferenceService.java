package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.CrossVersionObjectReference;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface CrossVersionObjectReferenceService {

    @GET("crossVersionObjectReference")
    Call<TypeCollection<CrossVersionObjectReference>> list();

    @GET("crossVersionObjectReference")
    Call<TypeCollection<CrossVersionObjectReference>> list(@QueryMap Filters filters);

    @GET("crossVersionObjectReference/{id}")
    Call<CrossVersionObjectReference> get(@Path("id") String id);

    @POST("crossVersionObjectReference")
    Call<CrossVersionObjectReference> create(@Body CrossVersionObjectReference crossVersionObjectReference);

    @PUT("crossVersionObjectReference/{id}")
    Call<CrossVersionObjectReference> update(@Path("id") String id, @Body CrossVersionObjectReference crossVersionObjectReference);

    @DELETE("crossVersionObjectReference/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
