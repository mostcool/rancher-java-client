package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PortTrafficPolicy;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PortTrafficPolicyService {

    @GET("portTrafficPolicy")
    Call<TypeCollection<PortTrafficPolicy>> list();

    @GET("portTrafficPolicy")
    Call<TypeCollection<PortTrafficPolicy>> list(@QueryMap Filters filters);

    @GET("portTrafficPolicy/{id}")
    Call<PortTrafficPolicy> get(@Path("id") String id);

    @POST("portTrafficPolicy")
    Call<PortTrafficPolicy> create(@Body PortTrafficPolicy portTrafficPolicy);

    @PUT("portTrafficPolicy/{id}")
    Call<PortTrafficPolicy> update(@Path("id") String id, @Body PortTrafficPolicy portTrafficPolicy);

    @DELETE("portTrafficPolicy/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
