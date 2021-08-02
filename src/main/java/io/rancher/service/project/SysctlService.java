package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Sysctl;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SysctlService {

    @GET("sysctl")
    Call<TypeCollection<Sysctl>> list();

    @GET("sysctl")
    Call<TypeCollection<Sysctl>> list(@QueryMap Filters filters);

    @GET("sysctl/{id}")
    Call<Sysctl> get(@Path("id") String id);

    @POST("sysctl")
    Call<Sysctl> create(@Body Sysctl sysctl);

    @PUT("sysctl/{id}")
    Call<Sysctl> update(@Path("id") String id, @Body Sysctl sysctl);

    @DELETE("sysctl/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
