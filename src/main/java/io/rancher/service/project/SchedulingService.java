package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Scheduling;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SchedulingService {

    @GET("scheduling")
    Call<TypeCollection<Scheduling>> list();

    @GET("scheduling")
    Call<TypeCollection<Scheduling>> list(@QueryMap Filters filters);

    @GET("scheduling/{id}")
    Call<Scheduling> get(@Path("id") String id);

    @POST("scheduling")
    Call<Scheduling> create(@Body Scheduling scheduling);

    @PUT("scheduling/{id}")
    Call<Scheduling> update(@Path("id") String id, @Body Scheduling scheduling);

    @DELETE("scheduling/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
