package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PodReadinessGate;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PodReadinessGateService {

    @GET("podReadinessGate")
    Call<TypeCollection<PodReadinessGate>> list();

    @GET("podReadinessGate")
    Call<TypeCollection<PodReadinessGate>> list(@QueryMap Filters filters);

    @GET("podReadinessGate/{id}")
    Call<PodReadinessGate> get(@Path("id") String id);

    @POST("podReadinessGate")
    Call<PodReadinessGate> create(@Body PodReadinessGate podReadinessGate);

    @PUT("podReadinessGate/{id}")
    Call<PodReadinessGate> update(@Path("id") String id, @Body PodReadinessGate podReadinessGate);

    @DELETE("podReadinessGate/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
