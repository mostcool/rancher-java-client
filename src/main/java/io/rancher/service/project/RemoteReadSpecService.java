package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.RemoteReadSpec;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface RemoteReadSpecService {

    @GET("remoteReadSpec")
    Call<TypeCollection<RemoteReadSpec>> list();

    @GET("remoteReadSpec")
    Call<TypeCollection<RemoteReadSpec>> list(@QueryMap Filters filters);

    @GET("remoteReadSpec/{id}")
    Call<RemoteReadSpec> get(@Path("id") String id);

    @POST("remoteReadSpec")
    Call<RemoteReadSpec> create(@Body RemoteReadSpec remoteReadSpec);

    @PUT("remoteReadSpec/{id}")
    Call<RemoteReadSpec> update(@Path("id") String id, @Body RemoteReadSpec remoteReadSpec);

    @DELETE("remoteReadSpec/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
