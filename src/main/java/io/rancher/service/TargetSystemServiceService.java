package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.TargetSystemService;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface TargetSystemServiceService {

    @GET("targetSystemService")
    Call<TypeCollection<TargetSystemService>> list();

    @GET("targetSystemService")
    Call<TypeCollection<TargetSystemService>> list(@QueryMap Filters filters);

    @GET("targetSystemService/{id}")
    Call<TargetSystemService> get(@Path("id") String id);

    @POST("targetSystemService")
    Call<TargetSystemService> create(@Body TargetSystemService targetSystemService);

    @PUT("targetSystemService/{id}")
    Call<TargetSystemService> update(@Path("id") String id, @Body TargetSystemService targetSystemService);

    @DELETE("targetSystemService/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
