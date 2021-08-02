package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Gateway;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface GatewayService {

    @GET("gateway")
    Call<TypeCollection<Gateway>> list();

    @GET("gateway")
    Call<TypeCollection<Gateway>> list(@QueryMap Filters filters);

    @GET("gateway/{id}")
    Call<Gateway> get(@Path("id") String id);

    @POST("gateway")
    Call<Gateway> create(@Body Gateway gateway);

    @PUT("gateway/{id}")
    Call<Gateway> update(@Path("id") String id, @Body Gateway gateway);

    @DELETE("gateway/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
