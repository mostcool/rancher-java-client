package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.GenerateKubeConfigOutput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface GenerateKubeConfigOutputService {

    @GET("generateKubeConfigOutput")
    Call<TypeCollection<GenerateKubeConfigOutput>> list();

    @GET("generateKubeConfigOutput")
    Call<TypeCollection<GenerateKubeConfigOutput>> list(@QueryMap Filters filters);

    @GET("generateKubeConfigOutput/{id}")
    Call<GenerateKubeConfigOutput> get(@Path("id") String id);

    @POST("generateKubeConfigOutput")
    Call<GenerateKubeConfigOutput> create(@Body GenerateKubeConfigOutput generateKubeConfigOutput);

    @PUT("generateKubeConfigOutput/{id}")
    Call<GenerateKubeConfigOutput> update(@Path("id") String id, @Body GenerateKubeConfigOutput generateKubeConfigOutput);

    @DELETE("generateKubeConfigOutput/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
