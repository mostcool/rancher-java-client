package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Container;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ContainerService {

    @GET("container")
    Call<TypeCollection<Container>> list();

    @GET("container")
    Call<TypeCollection<Container>> list(@QueryMap Filters filters);

    @GET("container/{id}")
    Call<Container> get(@Path("id") String id);

    @POST("container")
    Call<Container> create(@Body Container container);

    @PUT("container/{id}")
    Call<Container> update(@Path("id") String id, @Body Container container);

    @DELETE("container/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
