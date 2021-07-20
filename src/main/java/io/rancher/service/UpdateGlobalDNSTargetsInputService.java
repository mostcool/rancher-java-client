package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.UpdateGlobalDNSTargetsInput;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface UpdateGlobalDNSTargetsInputService {

    @GET("updateGlobalDNSTargetsInput")
    Call<TypeCollection<UpdateGlobalDNSTargetsInput>> list();

    @GET("updateGlobalDNSTargetsInput")
    Call<TypeCollection<UpdateGlobalDNSTargetsInput>> list(@QueryMap Filters filters);

    @GET("updateGlobalDNSTargetsInput/{id}")
    Call<UpdateGlobalDNSTargetsInput> get(@Path("id") String id);

    @POST("updateGlobalDNSTargetsInput")
    Call<UpdateGlobalDNSTargetsInput> create(@Body UpdateGlobalDNSTargetsInput updateGlobalDNSTargetsInput);

    @PUT("updateGlobalDNSTargetsInput/{id}")
    Call<UpdateGlobalDNSTargetsInput> update(@Path("id") String id, @Body UpdateGlobalDNSTargetsInput updateGlobalDNSTargetsInput);

    @DELETE("updateGlobalDNSTargetsInput/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
