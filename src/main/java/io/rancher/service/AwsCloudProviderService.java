package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AwsCloudProvider;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AwsCloudProviderService {

    @GET("awsCloudProvider")
    Call<TypeCollection<AwsCloudProvider>> list();

    @GET("awsCloudProvider")
    Call<TypeCollection<AwsCloudProvider>> list(@QueryMap Filters filters);

    @GET("awsCloudProvider/{id}")
    Call<AwsCloudProvider> get(@Path("id") String id);

    @POST("awsCloudProvider")
    Call<AwsCloudProvider> create(@Body AwsCloudProvider awsCloudProvider);

    @PUT("awsCloudProvider/{id}")
    Call<AwsCloudProvider> update(@Path("id") String id, @Body AwsCloudProvider awsCloudProvider);

    @DELETE("awsCloudProvider/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
