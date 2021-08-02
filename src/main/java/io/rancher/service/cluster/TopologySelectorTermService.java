package io.rancher.service.cluster;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.cluster.TopologySelectorTerm;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface TopologySelectorTermService {

    @GET("topologySelectorTerm")
    Call<TypeCollection<TopologySelectorTerm>> list();

    @GET("topologySelectorTerm")
    Call<TypeCollection<TopologySelectorTerm>> list(@QueryMap Filters filters);

    @GET("topologySelectorTerm/{id}")
    Call<TopologySelectorTerm> get(@Path("id") String id);

    @POST("topologySelectorTerm")
    Call<TopologySelectorTerm> create(@Body TopologySelectorTerm topologySelectorTerm);

    @PUT("topologySelectorTerm/{id}")
    Call<TopologySelectorTerm> update(@Path("id") String id, @Body TopologySelectorTerm topologySelectorTerm);

    @DELETE("topologySelectorTerm/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
