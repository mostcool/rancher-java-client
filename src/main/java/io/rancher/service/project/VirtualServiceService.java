package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.VirtualService;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface VirtualServiceService {

    @GET("virtualService")
    Call<TypeCollection<VirtualService>> list();

    @GET("virtualService")
    Call<TypeCollection<VirtualService>> list(@QueryMap Filters filters);

    @GET("virtualService/{id}")
    Call<VirtualService> get(@Path("id") String id);

    @POST("virtualService")
    Call<VirtualService> create(@Body VirtualService virtualService);

    @PUT("virtualService/{id}")
    Call<VirtualService> update(@Path("id") String id, @Body VirtualService virtualService);

    @DELETE("virtualService/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
