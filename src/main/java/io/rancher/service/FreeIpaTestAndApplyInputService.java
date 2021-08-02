package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.FreeIpaTestAndApplyInput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface FreeIpaTestAndApplyInputService {

    @GET("freeIpaTestAndApplyInput")
    Call<TypeCollection<FreeIpaTestAndApplyInput>> list();

    @GET("freeIpaTestAndApplyInput")
    Call<TypeCollection<FreeIpaTestAndApplyInput>> list(@QueryMap Filters filters);

    @GET("freeIpaTestAndApplyInput/{id}")
    Call<FreeIpaTestAndApplyInput> get(@Path("id") String id);

    @POST("freeIpaTestAndApplyInput")
    Call<FreeIpaTestAndApplyInput> create(@Body FreeIpaTestAndApplyInput freeIpaTestAndApplyInput);

    @PUT("freeIpaTestAndApplyInput/{id}")
    Call<FreeIpaTestAndApplyInput> update(@Path("id") String id, @Body FreeIpaTestAndApplyInput freeIpaTestAndApplyInput);

    @DELETE("freeIpaTestAndApplyInput/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
