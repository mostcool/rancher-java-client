package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.ApiService;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ApiServiceService {

    @GET("apiService")
    Call<TypeCollection<ApiService>> list();

    @GET("apiService")
    Call<TypeCollection<ApiService>> list(@QueryMap Filters filters);

    @GET("apiService/{id}")
    Call<ApiService> get(@Path("id") String id);

    @POST("apiService")
    Call<ApiService> create(@Body ApiService apiService);

    @PUT("apiService/{id}")
    Call<ApiService> update(@Path("id") String id, @Body ApiService apiService);

    @DELETE("apiService/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
