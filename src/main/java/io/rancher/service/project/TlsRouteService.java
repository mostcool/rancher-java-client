package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.TlsRoute;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface TlsRouteService {

    @GET("tlsRoute")
    Call<TypeCollection<TlsRoute>> list();

    @GET("tlsRoute")
    Call<TypeCollection<TlsRoute>> list(@QueryMap Filters filters);

    @GET("tlsRoute/{id}")
    Call<TlsRoute> get(@Path("id") String id);

    @POST("tlsRoute")
    Call<TlsRoute> create(@Body TlsRoute tlsRoute);

    @PUT("tlsRoute/{id}")
    Call<TlsRoute> update(@Path("id") String id, @Body TlsRoute tlsRoute);

    @DELETE("tlsRoute/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
