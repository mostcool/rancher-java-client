package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Headers;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface HeadersService {

    @GET("headers")
    Call<TypeCollection<Headers>> list();

    @GET("headers")
    Call<TypeCollection<Headers>> list(@QueryMap Filters filters);

    @GET("headers/{id}")
    Call<Headers> get(@Path("id") String id);

    @POST("headers")
    Call<Headers> create(@Body Headers headers);

    @PUT("headers/{id}")
    Call<Headers> update(@Path("id") String id, @Body Headers headers);

    @DELETE("headers/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
