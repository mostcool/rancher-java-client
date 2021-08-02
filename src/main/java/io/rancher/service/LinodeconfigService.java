package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Linodeconfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface LinodeconfigService {

    @GET("linodeconfig")
    Call<TypeCollection<Linodeconfig>> list();

    @GET("linodeconfig")
    Call<TypeCollection<Linodeconfig>> list(@QueryMap Filters filters);

    @GET("linodeconfig/{id}")
    Call<Linodeconfig> get(@Path("id") String id);

    @POST("linodeconfig")
    Call<Linodeconfig> create(@Body Linodeconfig linodeconfig);

    @PUT("linodeconfig/{id}")
    Call<Linodeconfig> update(@Path("id") String id, @Body Linodeconfig linodeconfig);

    @DELETE("linodeconfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
