package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.AppRevision;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface AppRevisionService {

    @GET("appRevision")
    Call<TypeCollection<AppRevision>> list();

    @GET("appRevision")
    Call<TypeCollection<AppRevision>> list(@QueryMap Filters filters);

    @GET("appRevision/{id}")
    Call<AppRevision> get(@Path("id") String id);

    @POST("appRevision")
    Call<AppRevision> create(@Body AppRevision appRevision);

    @PUT("appRevision/{id}")
    Call<AppRevision> update(@Path("id") String id, @Body AppRevision appRevision);

    @DELETE("appRevision/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
