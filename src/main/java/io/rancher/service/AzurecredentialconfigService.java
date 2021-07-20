package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Azurecredentialconfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface AzurecredentialconfigService {

    @GET("azurecredentialconfig")
    Call<TypeCollection<Azurecredentialconfig>> list();

    @GET("azurecredentialconfig")
    Call<TypeCollection<Azurecredentialconfig>> list(@QueryMap Filters filters);

    @GET("azurecredentialconfig/{id}")
    Call<Azurecredentialconfig> get(@Path("id") String id);

    @POST("azurecredentialconfig")
    Call<Azurecredentialconfig> create(@Body Azurecredentialconfig azurecredentialconfig);

    @PUT("azurecredentialconfig/{id}")
    Call<Azurecredentialconfig> update(@Path("id") String id, @Body Azurecredentialconfig azurecredentialconfig);

    @DELETE("azurecredentialconfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
