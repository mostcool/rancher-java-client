package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Toleration;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface TolerationService {

    @GET("toleration")
    Call<TypeCollection<Toleration>> list();

    @GET("toleration")
    Call<TypeCollection<Toleration>> list(@QueryMap Filters filters);

    @GET("toleration/{id}")
    Call<Toleration> get(@Path("id") String id);

    @POST("toleration")
    Call<Toleration> create(@Body Toleration toleration);

    @PUT("toleration/{id}")
    Call<Toleration> update(@Path("id") String id, @Body Toleration toleration);

    @DELETE("toleration/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
