package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CatalogRefresh;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface CatalogRefreshService {

    @GET("catalogRefresh")
    Call<TypeCollection<CatalogRefresh>> list();

    @GET("catalogRefresh")
    Call<TypeCollection<CatalogRefresh>> list(@QueryMap Filters filters);

    @GET("catalogRefresh/{id}")
    Call<CatalogRefresh> get(@Path("id") String id);

    @POST("catalogRefresh")
    Call<CatalogRefresh> create(@Body CatalogRefresh catalogRefresh);

    @PUT("catalogRefresh/{id}")
    Call<CatalogRefresh> update(@Path("id") String id, @Body CatalogRefresh catalogRefresh);

    @DELETE("catalogRefresh/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
