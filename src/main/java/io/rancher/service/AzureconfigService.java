package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Azureconfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface AzureconfigService {

    @GET("azureconfig")
    Call<TypeCollection<Azureconfig>> list();

    @GET("azureconfig")
    Call<TypeCollection<Azureconfig>> list(@QueryMap Filters filters);

    @GET("azureconfig/{id}")
    Call<Azureconfig> get(@Path("id") String id);

    @POST("azureconfig")
    Call<Azureconfig> create(@Body Azureconfig azureconfig);

    @PUT("azureconfig/{id}")
    Call<Azureconfig> update(@Path("id") String id, @Body Azureconfig azureconfig);

    @DELETE("azureconfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
