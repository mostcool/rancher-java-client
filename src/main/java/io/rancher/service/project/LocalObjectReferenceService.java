package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.LocalObjectReference;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface LocalObjectReferenceService {

    @GET("localObjectReference")
    Call<TypeCollection<LocalObjectReference>> list();

    @GET("localObjectReference")
    Call<TypeCollection<LocalObjectReference>> list(@QueryMap Filters filters);

    @GET("localObjectReference/{id}")
    Call<LocalObjectReference> get(@Path("id") String id);

    @POST("localObjectReference")
    Call<LocalObjectReference> create(@Body LocalObjectReference localObjectReference);

    @PUT("localObjectReference/{id}")
    Call<LocalObjectReference> update(@Path("id") String id, @Body LocalObjectReference localObjectReference);

    @DELETE("localObjectReference/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
