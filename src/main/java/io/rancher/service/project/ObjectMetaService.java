package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ObjectMeta;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ObjectMetaService {

    @GET("objectMeta")
    Call<TypeCollection<ObjectMeta>> list();

    @GET("objectMeta")
    Call<TypeCollection<ObjectMeta>> list(@QueryMap Filters filters);

    @GET("objectMeta/{id}")
    Call<ObjectMeta> get(@Path("id") String id);

    @POST("objectMeta")
    Call<ObjectMeta> create(@Body ObjectMeta objectMeta);

    @PUT("objectMeta/{id}")
    Call<ObjectMeta> update(@Path("id") String id, @Body ObjectMeta objectMeta);

    @DELETE("objectMeta/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
