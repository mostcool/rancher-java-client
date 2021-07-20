package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Rules;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface RulesService {

    @GET("rules")
    Call<TypeCollection<Rules>> list();

    @GET("rules")
    Call<TypeCollection<Rules>> list(@QueryMap Filters filters);

    @GET("rules/{id}")
    Call<Rules> get(@Path("id") String id);

    @POST("rules")
    Call<Rules> create(@Body Rules rules);

    @PUT("rules/{id}")
    Call<Rules> update(@Path("id") String id, @Body Rules rules);

    @DELETE("rules/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
