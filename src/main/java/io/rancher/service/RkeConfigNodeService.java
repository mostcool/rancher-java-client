package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RkeConfigNode;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface RkeConfigNodeService {

    @GET("rkeConfigNode")
    Call<TypeCollection<RkeConfigNode>> list();

    @GET("rkeConfigNode")
    Call<TypeCollection<RkeConfigNode>> list(@QueryMap Filters filters);

    @GET("rkeConfigNode/{id}")
    Call<RkeConfigNode> get(@Path("id") String id);

    @POST("rkeConfigNode")
    Call<RkeConfigNode> create(@Body RkeConfigNode rkeConfigNode);

    @PUT("rkeConfigNode/{id}")
    Call<RkeConfigNode> update(@Path("id") String id, @Body RkeConfigNode rkeConfigNode);

    @DELETE("rkeConfigNode/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
