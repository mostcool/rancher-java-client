package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Principal;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PrincipalService {

    @GET("principal")
    Call<TypeCollection<Principal>> list();

    @GET("principal")
    Call<TypeCollection<Principal>> list(@QueryMap Filters filters);

    @GET("principal/{id}")
    Call<Principal> get(@Path("id") String id);

    @POST("principal")
    Call<Principal> create(@Body Principal principal);

    @PUT("principal/{id}")
    Call<Principal> update(@Path("id") String id, @Body Principal principal);

    @DELETE("principal/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
