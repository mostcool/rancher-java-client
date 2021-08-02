package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.LabelSelector;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface LabelSelectorService {

    @GET("labelSelector")
    Call<TypeCollection<LabelSelector>> list();

    @GET("labelSelector")
    Call<TypeCollection<LabelSelector>> list(@QueryMap Filters filters);

    @GET("labelSelector/{id}")
    Call<LabelSelector> get(@Path("id") String id);

    @POST("labelSelector")
    Call<LabelSelector> create(@Body LabelSelector labelSelector);

    @PUT("labelSelector/{id}")
    Call<LabelSelector> update(@Path("id") String id, @Body LabelSelector labelSelector);

    @DELETE("labelSelector/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
