package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Alertmanager;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AlertmanagerService {

    @GET("alertmanager")
    Call<TypeCollection<Alertmanager>> list();

    @GET("alertmanager")
    Call<TypeCollection<Alertmanager>> list(@QueryMap Filters filters);

    @GET("alertmanager/{id}")
    Call<Alertmanager> get(@Path("id") String id);

    @POST("alertmanager")
    Call<Alertmanager> create(@Body Alertmanager alertmanager);

    @PUT("alertmanager/{id}")
    Call<Alertmanager> update(@Path("id") String id, @Body Alertmanager alertmanager);

    @DELETE("alertmanager/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
