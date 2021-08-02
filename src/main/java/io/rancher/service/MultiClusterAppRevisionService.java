package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.MultiClusterAppRevision;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface MultiClusterAppRevisionService {

    @GET("multiClusterAppRevision")
    Call<TypeCollection<MultiClusterAppRevision>> list();

    @GET("multiClusterAppRevision")
    Call<TypeCollection<MultiClusterAppRevision>> list(@QueryMap Filters filters);

    @GET("multiClusterAppRevision/{id}")
    Call<MultiClusterAppRevision> get(@Path("id") String id);

    @POST("multiClusterAppRevision")
    Call<MultiClusterAppRevision> create(@Body MultiClusterAppRevision multiClusterAppRevision);

    @PUT("multiClusterAppRevision/{id}")
    Call<MultiClusterAppRevision> update(@Path("id") String id, @Body MultiClusterAppRevision multiClusterAppRevision);

    @DELETE("multiClusterAppRevision/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
