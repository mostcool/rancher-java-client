package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Filter;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface FilterService {

    @GET("filter")
    Call<TypeCollection<Filter>> list();

    @GET("filter")
    Call<TypeCollection<Filter>> list(@QueryMap Filters filters);

    @GET("filter/{id}")
    Call<Filter> get(@Path("id") String id);

    @POST("filter")
    Call<Filter> create(@Body Filter filter);

    @PUT("filter/{id}")
    Call<Filter> update(@Path("id") String id, @Body Filter filter);

    @DELETE("filter/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
