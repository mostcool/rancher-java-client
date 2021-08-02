package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CisBenchmarkVersion;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface CisBenchmarkVersionService {

    @GET("cisBenchmarkVersion")
    Call<TypeCollection<CisBenchmarkVersion>> list();

    @GET("cisBenchmarkVersion")
    Call<TypeCollection<CisBenchmarkVersion>> list(@QueryMap Filters filters);

    @GET("cisBenchmarkVersion/{id}")
    Call<CisBenchmarkVersion> get(@Path("id") String id);

    @POST("cisBenchmarkVersion")
    Call<CisBenchmarkVersion> create(@Body CisBenchmarkVersion cisBenchmarkVersion);

    @PUT("cisBenchmarkVersion/{id}")
    Call<CisBenchmarkVersion> update(@Path("id") String id, @Body CisBenchmarkVersion cisBenchmarkVersion);

    @DELETE("cisBenchmarkVersion/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
