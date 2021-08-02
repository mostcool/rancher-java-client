package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.NamespaceMove;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface NamespaceMoveService {

    @GET("namespaceMove")
    Call<TypeCollection<NamespaceMove>> list();

    @GET("namespaceMove")
    Call<TypeCollection<NamespaceMove>> list(@QueryMap Filters filters);

    @GET("namespaceMove/{id}")
    Call<NamespaceMove> get(@Path("id") String id);

    @POST("namespaceMove")
    Call<NamespaceMove> create(@Body NamespaceMove namespaceMove);

    @PUT("namespaceMove/{id}")
    Call<NamespaceMove> update(@Path("id") String id, @Body NamespaceMove namespaceMove);

    @DELETE("namespaceMove/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
