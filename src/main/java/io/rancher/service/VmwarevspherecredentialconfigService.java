package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Vmwarevspherecredentialconfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface VmwarevspherecredentialconfigService {

    @GET("vmwarevspherecredentialconfig")
    Call<TypeCollection<Vmwarevspherecredentialconfig>> list();

    @GET("vmwarevspherecredentialconfig")
    Call<TypeCollection<Vmwarevspherecredentialconfig>> list(@QueryMap Filters filters);

    @GET("vmwarevspherecredentialconfig/{id}")
    Call<Vmwarevspherecredentialconfig> get(@Path("id") String id);

    @POST("vmwarevspherecredentialconfig")
    Call<Vmwarevspherecredentialconfig> create(@Body Vmwarevspherecredentialconfig vmwarevspherecredentialconfig);

    @PUT("vmwarevspherecredentialconfig/{id}")
    Call<Vmwarevspherecredentialconfig> update(@Path("id") String id, @Body Vmwarevspherecredentialconfig vmwarevspherecredentialconfig);

    @DELETE("vmwarevspherecredentialconfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
