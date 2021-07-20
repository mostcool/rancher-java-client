package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Preference;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface PreferenceService {

    @GET("preference")
    Call<TypeCollection<Preference>> list();

    @GET("preference")
    Call<TypeCollection<Preference>> list(@QueryMap Filters filters);

    @GET("preference/{id}")
    Call<Preference> get(@Path("id") String id);

    @POST("preference")
    Call<Preference> create(@Body Preference preference);

    @PUT("preference/{id}")
    Call<Preference> update(@Path("id") String id, @Body Preference preference);

    @DELETE("preference/{id}")
    Call<Response> delete(@Path("id") String id);
    
}