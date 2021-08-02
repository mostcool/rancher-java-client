package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PodIP;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PodIPService {

    @GET("podIP")
    Call<TypeCollection<PodIP>> list();

    @GET("podIP")
    Call<TypeCollection<PodIP>> list(@QueryMap Filters filters);

    @GET("podIP/{id}")
    Call<PodIP> get(@Path("id") String id);

    @POST("podIP")
    Call<PodIP> create(@Body PodIP podIP);

    @PUT("podIP/{id}")
    Call<PodIP> update(@Path("id") String id, @Body PodIP podIP);

    @DELETE("podIP/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
