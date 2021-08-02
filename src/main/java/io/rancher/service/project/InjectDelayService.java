package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.InjectDelay;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface InjectDelayService {

    @GET("injectDelay")
    Call<TypeCollection<InjectDelay>> list();

    @GET("injectDelay")
    Call<TypeCollection<InjectDelay>> list(@QueryMap Filters filters);

    @GET("injectDelay/{id}")
    Call<InjectDelay> get(@Path("id") String id);

    @POST("injectDelay")
    Call<InjectDelay> create(@Body InjectDelay injectDelay);

    @PUT("injectDelay/{id}")
    Call<InjectDelay> update(@Path("id") String id, @Body InjectDelay injectDelay);

    @DELETE("injectDelay/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
