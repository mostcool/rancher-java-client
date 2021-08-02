package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Field;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface FieldService {

    @GET("field")
    Call<TypeCollection<Field>> list();

    @GET("field")
    Call<TypeCollection<Field>> list(@QueryMap Filters filters);

    @GET("field/{id}")
    Call<Field> get(@Path("id") String id);

    @POST("field")
    Call<Field> create(@Body Field field);

    @PUT("field/{id}")
    Call<Field> update(@Path("id") String id, @Body Field field);

    @DELETE("field/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
