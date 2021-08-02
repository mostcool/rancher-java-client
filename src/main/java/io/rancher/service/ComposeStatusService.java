package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ComposeStatus;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ComposeStatusService {

    @GET("composeStatus")
    Call<TypeCollection<ComposeStatus>> list();

    @GET("composeStatus")
    Call<TypeCollection<ComposeStatus>> list(@QueryMap Filters filters);

    @GET("composeStatus/{id}")
    Call<ComposeStatus> get(@Path("id") String id);

    @POST("composeStatus")
    Call<ComposeStatus> create(@Body ComposeStatus composeStatus);

    @PUT("composeStatus/{id}")
    Call<ComposeStatus> update(@Path("id") String id, @Body ComposeStatus composeStatus);

    @DELETE("composeStatus/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
