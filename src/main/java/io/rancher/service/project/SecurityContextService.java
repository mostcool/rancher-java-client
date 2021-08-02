package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.SecurityContext;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SecurityContextService {

    @GET("securityContext")
    Call<TypeCollection<SecurityContext>> list();

    @GET("securityContext")
    Call<TypeCollection<SecurityContext>> list(@QueryMap Filters filters);

    @GET("securityContext/{id}")
    Call<SecurityContext> get(@Path("id") String id);

    @POST("securityContext")
    Call<SecurityContext> create(@Body SecurityContext securityContext);

    @PUT("securityContext/{id}")
    Call<SecurityContext> update(@Path("id") String id, @Body SecurityContext securityContext);

    @DELETE("securityContext/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
