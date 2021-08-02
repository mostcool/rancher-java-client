package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RkeK8sSystemImage;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface RkeK8sSystemImageService {

    @GET("rkeK8sSystemImage")
    Call<TypeCollection<RkeK8sSystemImage>> list();

    @GET("rkeK8sSystemImage")
    Call<TypeCollection<RkeK8sSystemImage>> list(@QueryMap Filters filters);

    @GET("rkeK8sSystemImage/{id}")
    Call<RkeK8sSystemImage> get(@Path("id") String id);

    @POST("rkeK8sSystemImage")
    Call<RkeK8sSystemImage> create(@Body RkeK8sSystemImage rkeK8sSystemImage);

    @PUT("rkeK8sSystemImage/{id}")
    Call<RkeK8sSystemImage> update(@Path("id") String id, @Body RkeK8sSystemImage rkeK8sSystemImage);

    @DELETE("rkeK8sSystemImage/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
