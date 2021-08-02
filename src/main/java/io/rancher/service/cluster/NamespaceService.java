package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.Namespace;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface NamespaceService {

    @GET("namespace")
    Call<TypeCollection<Namespace>> list();

    @GET("namespace")
    Call<TypeCollection<Namespace>> list(@QueryMap Filters filters);

    @GET("namespace/{id}")
    Call<Namespace> get(@Path("id") String id);

    @POST("namespace")
    Call<Namespace> create(@Body Namespace namespace);

    @PUT("namespace/{id}")
    Call<Namespace> update(@Path("id") String id, @Body Namespace namespace);

    @DELETE("namespace/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
