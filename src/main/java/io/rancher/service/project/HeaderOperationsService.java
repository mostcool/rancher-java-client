package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.HeaderOperations;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface HeaderOperationsService {

    @GET("headerOperations")
    Call<TypeCollection<HeaderOperations>> list();

    @GET("headerOperations")
    Call<TypeCollection<HeaderOperations>> list(@QueryMap Filters filters);

    @GET("headerOperations/{id}")
    Call<HeaderOperations> get(@Path("id") String id);

    @POST("headerOperations")
    Call<HeaderOperations> create(@Body HeaderOperations headerOperations);

    @PUT("headerOperations/{id}")
    Call<HeaderOperations> update(@Path("id") String id, @Body HeaderOperations headerOperations);

    @DELETE("headerOperations/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
