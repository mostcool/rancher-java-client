package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.GoogleOauthConfigTestOutput;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface GoogleOauthConfigTestOutputService {

    @GET("googleOauthConfigTestOutput")
    Call<TypeCollection<GoogleOauthConfigTestOutput>> list();

    @GET("googleOauthConfigTestOutput")
    Call<TypeCollection<GoogleOauthConfigTestOutput>> list(@QueryMap Filters filters);

    @GET("googleOauthConfigTestOutput/{id}")
    Call<GoogleOauthConfigTestOutput> get(@Path("id") String id);

    @POST("googleOauthConfigTestOutput")
    Call<GoogleOauthConfigTestOutput> create(@Body GoogleOauthConfigTestOutput googleOauthConfigTestOutput);

    @PUT("googleOauthConfigTestOutput/{id}")
    Call<GoogleOauthConfigTestOutput> update(@Path("id") String id, @Body GoogleOauthConfigTestOutput googleOauthConfigTestOutput);

    @DELETE("googleOauthConfigTestOutput/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
