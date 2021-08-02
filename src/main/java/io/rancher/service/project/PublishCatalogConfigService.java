package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PublishCatalogConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PublishCatalogConfigService {

    @GET("publishCatalogConfig")
    Call<TypeCollection<PublishCatalogConfig>> list();

    @GET("publishCatalogConfig")
    Call<TypeCollection<PublishCatalogConfig>> list(@QueryMap Filters filters);

    @GET("publishCatalogConfig/{id}")
    Call<PublishCatalogConfig> get(@Path("id") String id);

    @POST("publishCatalogConfig")
    Call<PublishCatalogConfig> create(@Body PublishCatalogConfig publishCatalogConfig);

    @PUT("publishCatalogConfig/{id}")
    Call<PublishCatalogConfig> update(@Path("id") String id, @Body PublishCatalogConfig publishCatalogConfig);

    @DELETE("publishCatalogConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
