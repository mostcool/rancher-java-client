package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Destination;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface DestinationService {

    @GET("destination")
    Call<TypeCollection<Destination>> list();

    @GET("destination")
    Call<TypeCollection<Destination>> list(@QueryMap Filters filters);

    @GET("destination/{id}")
    Call<Destination> get(@Path("id") String id);

    @POST("destination")
    Call<Destination> create(@Body Destination destination);

    @PUT("destination/{id}")
    Call<Destination> update(@Path("id") String id, @Body Destination destination);

    @DELETE("destination/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
