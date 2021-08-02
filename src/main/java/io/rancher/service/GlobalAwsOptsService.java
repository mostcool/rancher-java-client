package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.GlobalAwsOpts;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface GlobalAwsOptsService {

    @GET("globalAwsOpts")
    Call<TypeCollection<GlobalAwsOpts>> list();

    @GET("globalAwsOpts")
    Call<TypeCollection<GlobalAwsOpts>> list(@QueryMap Filters filters);

    @GET("globalAwsOpts/{id}")
    Call<GlobalAwsOpts> get(@Path("id") String id);

    @POST("globalAwsOpts")
    Call<GlobalAwsOpts> create(@Body GlobalAwsOpts globalAwsOpts);

    @PUT("globalAwsOpts/{id}")
    Call<GlobalAwsOpts> update(@Path("id") String id, @Body GlobalAwsOpts globalAwsOpts);

    @DELETE("globalAwsOpts/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
