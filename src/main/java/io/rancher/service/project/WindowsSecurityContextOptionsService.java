package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.WindowsSecurityContextOptions;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface WindowsSecurityContextOptionsService {

    @GET("windowsSecurityContextOptions")
    Call<TypeCollection<WindowsSecurityContextOptions>> list();

    @GET("windowsSecurityContextOptions")
    Call<TypeCollection<WindowsSecurityContextOptions>> list(@QueryMap Filters filters);

    @GET("windowsSecurityContextOptions/{id}")
    Call<WindowsSecurityContextOptions> get(@Path("id") String id);

    @POST("windowsSecurityContextOptions")
    Call<WindowsSecurityContextOptions> create(@Body WindowsSecurityContextOptions windowsSecurityContextOptions);

    @PUT("windowsSecurityContextOptions/{id}")
    Call<WindowsSecurityContextOptions> update(@Path("id") String id, @Body WindowsSecurityContextOptions windowsSecurityContextOptions);

    @DELETE("windowsSecurityContextOptions/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
