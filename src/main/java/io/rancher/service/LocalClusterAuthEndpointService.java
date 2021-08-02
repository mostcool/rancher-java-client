package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.LocalClusterAuthEndpoint;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface LocalClusterAuthEndpointService {

    @GET("localClusterAuthEndpoint")
    Call<TypeCollection<LocalClusterAuthEndpoint>> list();

    @GET("localClusterAuthEndpoint")
    Call<TypeCollection<LocalClusterAuthEndpoint>> list(@QueryMap Filters filters);

    @GET("localClusterAuthEndpoint/{id}")
    Call<LocalClusterAuthEndpoint> get(@Path("id") String id);

    @POST("localClusterAuthEndpoint")
    Call<LocalClusterAuthEndpoint> create(@Body LocalClusterAuthEndpoint localClusterAuthEndpoint);

    @PUT("localClusterAuthEndpoint/{id}")
    Call<LocalClusterAuthEndpoint> update(@Path("id") String id, @Body LocalClusterAuthEndpoint localClusterAuthEndpoint);

    @DELETE("localClusterAuthEndpoint/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
