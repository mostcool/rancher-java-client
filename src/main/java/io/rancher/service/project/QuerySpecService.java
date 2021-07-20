package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.QuerySpec;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface QuerySpecService {

    @GET("querySpec")
    Call<TypeCollection<QuerySpec>> list();

    @GET("querySpec")
    Call<TypeCollection<QuerySpec>> list(@QueryMap Filters filters);

    @GET("querySpec/{id}")
    Call<QuerySpec> get(@Path("id") String id);

    @POST("querySpec")
    Call<QuerySpec> create(@Body QuerySpec querySpec);

    @PUT("querySpec/{id}")
    Call<QuerySpec> update(@Path("id") String id, @Body QuerySpec querySpec);

    @DELETE("querySpec/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
