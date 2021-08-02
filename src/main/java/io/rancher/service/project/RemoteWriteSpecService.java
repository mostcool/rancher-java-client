package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.RemoteWriteSpec;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface RemoteWriteSpecService {

    @GET("remoteWriteSpec")
    Call<TypeCollection<RemoteWriteSpec>> list();

    @GET("remoteWriteSpec")
    Call<TypeCollection<RemoteWriteSpec>> list(@QueryMap Filters filters);

    @GET("remoteWriteSpec/{id}")
    Call<RemoteWriteSpec> get(@Path("id") String id);

    @POST("remoteWriteSpec")
    Call<RemoteWriteSpec> create(@Body RemoteWriteSpec remoteWriteSpec);

    @PUT("remoteWriteSpec/{id}")
    Call<RemoteWriteSpec> update(@Path("id") String id, @Body RemoteWriteSpec remoteWriteSpec);

    @DELETE("remoteWriteSpec/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
