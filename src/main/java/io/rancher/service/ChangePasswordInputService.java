package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ChangePasswordInput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ChangePasswordInputService {

    @GET("changePasswordInput")
    Call<TypeCollection<ChangePasswordInput>> list();

    @GET("changePasswordInput")
    Call<TypeCollection<ChangePasswordInput>> list(@QueryMap Filters filters);

    @GET("changePasswordInput/{id}")
    Call<ChangePasswordInput> get(@Path("id") String id);

    @POST("changePasswordInput")
    Call<ChangePasswordInput> create(@Body ChangePasswordInput changePasswordInput);

    @PUT("changePasswordInput/{id}")
    Call<ChangePasswordInput> update(@Path("id") String id, @Body ChangePasswordInput changePasswordInput);

    @DELETE("changePasswordInput/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
