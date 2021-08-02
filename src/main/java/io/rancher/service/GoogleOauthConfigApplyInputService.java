package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.GoogleOauthConfigApplyInput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface GoogleOauthConfigApplyInputService {

    @GET("googleOauthConfigApplyInput")
    Call<TypeCollection<GoogleOauthConfigApplyInput>> list();

    @GET("googleOauthConfigApplyInput")
    Call<TypeCollection<GoogleOauthConfigApplyInput>> list(@QueryMap Filters filters);

    @GET("googleOauthConfigApplyInput/{id}")
    Call<GoogleOauthConfigApplyInput> get(@Path("id") String id);

    @POST("googleOauthConfigApplyInput")
    Call<GoogleOauthConfigApplyInput> create(@Body GoogleOauthConfigApplyInput googleOauthConfigApplyInput);

    @PUT("googleOauthConfigApplyInput/{id}")
    Call<GoogleOauthConfigApplyInput> update(@Path("id") String id, @Body GoogleOauthConfigApplyInput googleOauthConfigApplyInput);

    @DELETE("googleOauthConfigApplyInput/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
