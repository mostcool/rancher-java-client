package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.TlsOptions;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface TlsOptionsService {

    @GET("tlsOptions")
    Call<TypeCollection<TlsOptions>> list();

    @GET("tlsOptions")
    Call<TypeCollection<TlsOptions>> list(@QueryMap Filters filters);

    @GET("tlsOptions/{id}")
    Call<TlsOptions> get(@Path("id") String id);

    @POST("tlsOptions")
    Call<TlsOptions> create(@Body TlsOptions tlsOptions);

    @PUT("tlsOptions/{id}")
    Call<TlsOptions> update(@Path("id") String id, @Body TlsOptions tlsOptions);

    @DELETE("tlsOptions/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
