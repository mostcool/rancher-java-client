package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.L4MatchAttributes;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface L4MatchAttributesService {

    @GET("l4MatchAttributes")
    Call<TypeCollection<L4MatchAttributes>> list();

    @GET("l4MatchAttributes")
    Call<TypeCollection<L4MatchAttributes>> list(@QueryMap Filters filters);

    @GET("l4MatchAttributes/{id}")
    Call<L4MatchAttributes> get(@Path("id") String id);

    @POST("l4MatchAttributes")
    Call<L4MatchAttributes> create(@Body L4MatchAttributes l4MatchAttributes);

    @PUT("l4MatchAttributes/{id}")
    Call<L4MatchAttributes> update(@Path("id") String id, @Body L4MatchAttributes l4MatchAttributes);

    @DELETE("l4MatchAttributes/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
