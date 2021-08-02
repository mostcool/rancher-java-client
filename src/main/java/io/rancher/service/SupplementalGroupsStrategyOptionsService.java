package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SupplementalGroupsStrategyOptions;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SupplementalGroupsStrategyOptionsService {

    @GET("supplementalGroupsStrategyOptions")
    Call<TypeCollection<SupplementalGroupsStrategyOptions>> list();

    @GET("supplementalGroupsStrategyOptions")
    Call<TypeCollection<SupplementalGroupsStrategyOptions>> list(@QueryMap Filters filters);

    @GET("supplementalGroupsStrategyOptions/{id}")
    Call<SupplementalGroupsStrategyOptions> get(@Path("id") String id);

    @POST("supplementalGroupsStrategyOptions")
    Call<SupplementalGroupsStrategyOptions> create(@Body SupplementalGroupsStrategyOptions supplementalGroupsStrategyOptions);

    @PUT("supplementalGroupsStrategyOptions/{id}")
    Call<SupplementalGroupsStrategyOptions> update(@Path("id") String id, @Body SupplementalGroupsStrategyOptions supplementalGroupsStrategyOptions);

    @DELETE("supplementalGroupsStrategyOptions/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
