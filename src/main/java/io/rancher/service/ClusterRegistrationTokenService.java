package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterRegistrationToken;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ClusterRegistrationTokenService {

    @GET("clusterRegistrationToken")
    Call<TypeCollection<ClusterRegistrationToken>> list();

    @GET("clusterRegistrationToken")
    Call<TypeCollection<ClusterRegistrationToken>> list(@QueryMap Filters filters);

    @GET("clusterRegistrationToken/{id}")
    Call<ClusterRegistrationToken> get(@Path("id") String id);

    @POST("clusterRegistrationToken")
    Call<ClusterRegistrationToken> create(@Body ClusterRegistrationToken clusterRegistrationToken);

    @PUT("clusterRegistrationToken/{id}")
    Call<ClusterRegistrationToken> update(@Path("id") String id, @Body ClusterRegistrationToken clusterRegistrationToken);

    @DELETE("clusterRegistrationToken/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
