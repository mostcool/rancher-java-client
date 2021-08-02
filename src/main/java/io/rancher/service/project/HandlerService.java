package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Handler;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface HandlerService {

    @GET("handler")
    Call<TypeCollection<Handler>> list();

    @GET("handler")
    Call<TypeCollection<Handler>> list(@QueryMap Filters filters);

    @GET("handler/{id}")
    Call<Handler> get(@Path("id") String id);

    @POST("handler")
    Call<Handler> create(@Body Handler handler);

    @PUT("handler/{id}")
    Call<Handler> update(@Path("id") String id, @Body Handler handler);

    @DELETE("handler/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
