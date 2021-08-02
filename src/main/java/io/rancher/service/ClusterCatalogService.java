package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CatalogRefresh;
import io.rancher.type.ClusterCatalog;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ClusterCatalogService {

    @GET("clusterCatalog")
    Call<TypeCollection<ClusterCatalog>> list();

    @GET("clusterCatalog")
    Call<TypeCollection<ClusterCatalog>> list(@QueryMap Filters filters);

    @GET("clusterCatalog/{id}")
    Call<ClusterCatalog> get(@Path("id") String id);

    @POST("clusterCatalog")
    Call<ClusterCatalog> create(@Body ClusterCatalog clusterCatalog);

    @PUT("clusterCatalog/{id}")
    Call<ClusterCatalog> update(@Path("id") String id, @Body ClusterCatalog clusterCatalog);

    @DELETE("clusterCatalog/{id}")
    Call<ResponseBody> delete(@Path("id") String id);

    @POST("clusterCatalog/{id}?action=refresh")
    Call<CatalogRefresh> refresh(@Path("id") String id);
}
