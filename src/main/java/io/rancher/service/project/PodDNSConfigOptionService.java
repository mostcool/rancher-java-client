package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PodDNSConfigOption;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PodDNSConfigOptionService {

    @GET("podDNSConfigOption")
    Call<TypeCollection<PodDNSConfigOption>> list();

    @GET("podDNSConfigOption")
    Call<TypeCollection<PodDNSConfigOption>> list(@QueryMap Filters filters);

    @GET("podDNSConfigOption/{id}")
    Call<PodDNSConfigOption> get(@Path("id") String id);

    @POST("podDNSConfigOption")
    Call<PodDNSConfigOption> create(@Body PodDNSConfigOption podDNSConfigOption);

    @PUT("podDNSConfigOption/{id}")
    Call<PodDNSConfigOption> update(@Path("id") String id, @Body PodDNSConfigOption podDNSConfigOption);

    @DELETE("podDNSConfigOption/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
