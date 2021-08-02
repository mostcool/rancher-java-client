package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Server;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ServerService {

    @GET("server")
    Call<TypeCollection<Server>> list();

    @GET("server")
    Call<TypeCollection<Server>> list(@QueryMap Filters filters);

    @GET("server/{id}")
    Call<Server> get(@Path("id") String id);

    @POST("server")
    Call<Server> create(@Body Server server);

    @PUT("server/{id}")
    Call<Server> update(@Path("id") String id, @Body Server server);

    @DELETE("server/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
