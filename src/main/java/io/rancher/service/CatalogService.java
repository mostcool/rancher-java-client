package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Catalog;
import io.rancher.type.CatalogRefresh;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface CatalogService {

    @GET("catalog")
    Call<TypeCollection<Catalog>> list();

    @GET("catalog")
    Call<TypeCollection<Catalog>> list(@QueryMap Filters filters);

    @GET("catalog/{id}")
    Call<Catalog> get(@Path("id") String id);

    @POST("catalog")
    Call<Catalog> create(@Body Catalog catalog);

    @PUT("catalog/{id}")
    Call<Catalog> update(@Path("id") String id, @Body Catalog catalog);

    @DELETE("catalog/{id}")
    Call<ResponseBody> delete(@Path("id") String id);

    @POST("catalog/{id}?action=refresh")
    Call<CatalogRefresh> refresh(@Path("id") String id);
}
