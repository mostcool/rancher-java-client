package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NamespaceResourceQuota;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface NamespaceResourceQuotaService {

    @GET("namespaceResourceQuota")
    Call<TypeCollection<NamespaceResourceQuota>> list();

    @GET("namespaceResourceQuota")
    Call<TypeCollection<NamespaceResourceQuota>> list(@QueryMap Filters filters);

    @GET("namespaceResourceQuota/{id}")
    Call<NamespaceResourceQuota> get(@Path("id") String id);

    @POST("namespaceResourceQuota")
    Call<NamespaceResourceQuota> create(@Body NamespaceResourceQuota namespaceResourceQuota);

    @PUT("namespaceResourceQuota/{id}")
    Call<NamespaceResourceQuota> update(@Path("id") String id, @Body NamespaceResourceQuota namespaceResourceQuota);

    @DELETE("namespaceResourceQuota/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
