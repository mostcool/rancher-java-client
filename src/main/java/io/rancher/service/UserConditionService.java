package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.UserCondition;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface UserConditionService {

    @GET("userCondition")
    Call<TypeCollection<UserCondition>> list();

    @GET("userCondition")
    Call<TypeCollection<UserCondition>> list(@QueryMap Filters filters);

    @GET("userCondition/{id}")
    Call<UserCondition> get(@Path("id") String id);

    @POST("userCondition")
    Call<UserCondition> create(@Body UserCondition userCondition);

    @PUT("userCondition/{id}")
    Call<UserCondition> update(@Path("id") String id, @Body UserCondition userCondition);

    @DELETE("userCondition/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
