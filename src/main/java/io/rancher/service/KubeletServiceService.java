package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.KubeletService;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface KubeletServiceService {

    @GET("kubeletService")
    Call<TypeCollection<KubeletService>> list();

    @GET("kubeletService")
    Call<TypeCollection<KubeletService>> list(@QueryMap Filters filters);

    @GET("kubeletService/{id}")
    Call<KubeletService> get(@Path("id") String id);

    @POST("kubeletService")
    Call<KubeletService> create(@Body KubeletService kubeletService);

    @PUT("kubeletService/{id}")
    Call<KubeletService> update(@Path("id") String id, @Body KubeletService kubeletService);

    @DELETE("kubeletService/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
