package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.DynamicSchema;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface DynamicSchemaService {

    @GET("dynamicSchema")
    Call<TypeCollection<DynamicSchema>> list();

    @GET("dynamicSchema")
    Call<TypeCollection<DynamicSchema>> list(@QueryMap Filters filters);

    @GET("dynamicSchema/{id}")
    Call<DynamicSchema> get(@Path("id") String id);

    @POST("dynamicSchema")
    Call<DynamicSchema> create(@Body DynamicSchema dynamicSchema);

    @PUT("dynamicSchema/{id}")
    Call<DynamicSchema> update(@Path("id") String id, @Body DynamicSchema dynamicSchema);

    @DELETE("dynamicSchema/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
