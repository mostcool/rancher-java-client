package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AzureADConfigApplyInput;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface AzureADConfigApplyInputService {

    @GET("azureADConfigApplyInput")
    Call<TypeCollection<AzureADConfigApplyInput>> list();

    @GET("azureADConfigApplyInput")
    Call<TypeCollection<AzureADConfigApplyInput>> list(@QueryMap Filters filters);

    @GET("azureADConfigApplyInput/{id}")
    Call<AzureADConfigApplyInput> get(@Path("id") String id);

    @POST("azureADConfigApplyInput")
    Call<AzureADConfigApplyInput> create(@Body AzureADConfigApplyInput azureADConfigApplyInput);

    @PUT("azureADConfigApplyInput/{id}")
    Call<AzureADConfigApplyInput> update(@Path("id") String id, @Body AzureADConfigApplyInput azureADConfigApplyInput);

    @DELETE("azureADConfigApplyInput/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
