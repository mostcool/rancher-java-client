package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RkeSystemImages;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface RkeSystemImagesService {

    @GET("rkeSystemImages")
    Call<TypeCollection<RkeSystemImages>> list();

    @GET("rkeSystemImages")
    Call<TypeCollection<RkeSystemImages>> list(@QueryMap Filters filters);

    @GET("rkeSystemImages/{id}")
    Call<RkeSystemImages> get(@Path("id") String id);

    @POST("rkeSystemImages")
    Call<RkeSystemImages> create(@Body RkeSystemImages rkeSystemImages);

    @PUT("rkeSystemImages/{id}")
    Call<RkeSystemImages> update(@Path("id") String id, @Body RkeSystemImages rkeSystemImages);

    @DELETE("rkeSystemImages/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
