package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.EphemeralContainer;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface EphemeralContainerService {

    @GET("ephemeralContainer")
    Call<TypeCollection<EphemeralContainer>> list();

    @GET("ephemeralContainer")
    Call<TypeCollection<EphemeralContainer>> list(@QueryMap Filters filters);

    @GET("ephemeralContainer/{id}")
    Call<EphemeralContainer> get(@Path("id") String id);

    @POST("ephemeralContainer")
    Call<EphemeralContainer> create(@Body EphemeralContainer ephemeralContainer);

    @PUT("ephemeralContainer/{id}")
    Call<EphemeralContainer> update(@Path("id") String id, @Body EphemeralContainer ephemeralContainer);

    @DELETE("ephemeralContainer/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
