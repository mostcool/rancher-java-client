package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ComponentCondition;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ComponentConditionService {

    @GET("componentCondition")
    Call<TypeCollection<ComponentCondition>> list();

    @GET("componentCondition")
    Call<TypeCollection<ComponentCondition>> list(@QueryMap Filters filters);

    @GET("componentCondition/{id}")
    Call<ComponentCondition> get(@Path("id") String id);

    @POST("componentCondition")
    Call<ComponentCondition> create(@Body ComponentCondition componentCondition);

    @PUT("componentCondition/{id}")
    Call<ComponentCondition> update(@Path("id") String id, @Body ComponentCondition componentCondition);

    @DELETE("componentCondition/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
