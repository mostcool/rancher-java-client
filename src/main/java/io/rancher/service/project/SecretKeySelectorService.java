package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.SecretKeySelector;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SecretKeySelectorService {

    @GET("secretKeySelector")
    Call<TypeCollection<SecretKeySelector>> list();

    @GET("secretKeySelector")
    Call<TypeCollection<SecretKeySelector>> list(@QueryMap Filters filters);

    @GET("secretKeySelector/{id}")
    Call<SecretKeySelector> get(@Path("id") String id);

    @POST("secretKeySelector")
    Call<SecretKeySelector> create(@Body SecretKeySelector secretKeySelector);

    @PUT("secretKeySelector/{id}")
    Call<SecretKeySelector> update(@Path("id") String id, @Body SecretKeySelector secretKeySelector);

    @DELETE("secretKeySelector/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
