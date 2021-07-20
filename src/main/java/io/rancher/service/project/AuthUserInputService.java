package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.AuthUserInput;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface AuthUserInputService {

    @GET("authUserInput")
    Call<TypeCollection<AuthUserInput>> list();

    @GET("authUserInput")
    Call<TypeCollection<AuthUserInput>> list(@QueryMap Filters filters);

    @GET("authUserInput/{id}")
    Call<AuthUserInput> get(@Path("id") String id);

    @POST("authUserInput")
    Call<AuthUserInput> create(@Body AuthUserInput authUserInput);

    @PUT("authUserInput/{id}")
    Call<AuthUserInput> update(@Path("id") String id, @Body AuthUserInput authUserInput);

    @DELETE("authUserInput/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
