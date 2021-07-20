package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.GlobalRole;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface GlobalRoleService {

    @GET("globalRole")
    Call<TypeCollection<GlobalRole>> list();

    @GET("globalRole")
    Call<TypeCollection<GlobalRole>> list(@QueryMap Filters filters);

    @GET("globalRole/{id}")
    Call<GlobalRole> get(@Path("id") String id);

    @POST("globalRole")
    Call<GlobalRole> create(@Body GlobalRole globalRole);

    @PUT("globalRole/{id}")
    Call<GlobalRole> update(@Path("id") String id, @Body GlobalRole globalRole);

    @DELETE("globalRole/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
