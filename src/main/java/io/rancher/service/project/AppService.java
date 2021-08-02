package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.App;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AppService {

    @GET("app")
    Call<TypeCollection<App>> list();

    @GET("app")
    Call<TypeCollection<App>> list(@QueryMap Filters filters);

    @GET("app/{id}")
    Call<App> get(@Path("id") String id);

    @POST("app")
    Call<App> create(@Body App app);

    @PUT("app/{id}")
    Call<App> update(@Path("id") String id, @Body App app);

    @DELETE("app/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
