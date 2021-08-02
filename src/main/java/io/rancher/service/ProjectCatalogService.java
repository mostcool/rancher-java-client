package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CatalogRefresh;
import io.rancher.type.ProjectCatalog;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ProjectCatalogService {

    @GET("projectCatalog")
    Call<TypeCollection<ProjectCatalog>> list();

    @GET("projectCatalog")
    Call<TypeCollection<ProjectCatalog>> list(@QueryMap Filters filters);

    @GET("projectCatalog/{id}")
    Call<ProjectCatalog> get(@Path("id") String id);

    @POST("projectCatalog")
    Call<ProjectCatalog> create(@Body ProjectCatalog projectCatalog);

    @PUT("projectCatalog/{id}")
    Call<ProjectCatalog> update(@Path("id") String id, @Body ProjectCatalog projectCatalog);

    @DELETE("projectCatalog/{id}")
    Call<ResponseBody> delete(@Path("id") String id);

    @POST("projectCatalog/{id}?action=refresh")
    Call<CatalogRefresh> refresh(@Path("id") String id);
}
