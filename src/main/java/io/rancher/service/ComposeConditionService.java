package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ComposeCondition;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ComposeConditionService {

    @GET("composeCondition")
    Call<TypeCollection<ComposeCondition>> list();

    @GET("composeCondition")
    Call<TypeCollection<ComposeCondition>> list(@QueryMap Filters filters);

    @GET("composeCondition/{id}")
    Call<ComposeCondition> get(@Path("id") String id);

    @POST("composeCondition")
    Call<ComposeCondition> create(@Body ComposeCondition composeCondition);

    @PUT("composeCondition/{id}")
    Call<ComposeCondition> update(@Path("id") String id, @Body ComposeCondition composeCondition);

    @DELETE("composeCondition/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
