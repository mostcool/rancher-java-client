package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SetPasswordInput;
import io.rancher.type.User;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface UserService {

    @GET("user")
    Call<TypeCollection<User>> list();

    @GET("user")
    Call<TypeCollection<User>> list(@QueryMap Filters filters);

    @GET("user/{id}")
    Call<User> get(@Path("id") String id);

    @POST("user")
    Call<User> create(@Body User user);

    @PUT("user/{id}")
    Call<User> update(@Path("id") String id, @Body User user);

    @DELETE("user/{id}")
    Call<ResponseBody> delete(@Path("id") String id);

    @POST("user/{id}?action=setpassword")
    Call<User> setpassword(@Path("id") String id, @Body SetPasswordInput setPasswordInput);
}
