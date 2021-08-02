package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.VirtualCenterConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface VirtualCenterConfigService {

    @GET("virtualCenterConfig")
    Call<TypeCollection<VirtualCenterConfig>> list();

    @GET("virtualCenterConfig")
    Call<TypeCollection<VirtualCenterConfig>> list(@QueryMap Filters filters);

    @GET("virtualCenterConfig/{id}")
    Call<VirtualCenterConfig> get(@Path("id") String id);

    @POST("virtualCenterConfig")
    Call<VirtualCenterConfig> create(@Body VirtualCenterConfig virtualCenterConfig);

    @PUT("virtualCenterConfig/{id}")
    Call<VirtualCenterConfig> update(@Path("id") String id, @Body VirtualCenterConfig virtualCenterConfig);

    @DELETE("virtualCenterConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
