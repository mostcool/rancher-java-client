package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.IngressStatus;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface IngressStatusService {

    @GET("ingressStatus")
    Call<TypeCollection<IngressStatus>> list();

    @GET("ingressStatus")
    Call<TypeCollection<IngressStatus>> list(@QueryMap Filters filters);

    @GET("ingressStatus/{id}")
    Call<IngressStatus> get(@Path("id") String id);

    @POST("ingressStatus")
    Call<IngressStatus> create(@Body IngressStatus ingressStatus);

    @PUT("ingressStatus/{id}")
    Call<IngressStatus> update(@Path("id") String id, @Body IngressStatus ingressStatus);

    @DELETE("ingressStatus/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
