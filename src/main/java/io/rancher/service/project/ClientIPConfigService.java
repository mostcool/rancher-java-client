package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ClientIPConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ClientIPConfigService {

    @GET("clientIPConfig")
    Call<TypeCollection<ClientIPConfig>> list();

    @GET("clientIPConfig")
    Call<TypeCollection<ClientIPConfig>> list(@QueryMap Filters filters);

    @GET("clientIPConfig/{id}")
    Call<ClientIPConfig> get(@Path("id") String id);

    @POST("clientIPConfig")
    Call<ClientIPConfig> create(@Body ClientIPConfig clientIPConfig);

    @PUT("clientIPConfig/{id}")
    Call<ClientIPConfig> update(@Path("id") String id, @Body ClientIPConfig clientIPConfig);

    @DELETE("clientIPConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
