package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.TopologySpreadConstraint;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface TopologySpreadConstraintService {

    @GET("topologySpreadConstraint")
    Call<TypeCollection<TopologySpreadConstraint>> list();

    @GET("topologySpreadConstraint")
    Call<TypeCollection<TopologySpreadConstraint>> list(@QueryMap Filters filters);

    @GET("topologySpreadConstraint/{id}")
    Call<TopologySpreadConstraint> get(@Path("id") String id);

    @POST("topologySpreadConstraint")
    Call<TopologySpreadConstraint> create(@Body TopologySpreadConstraint topologySpreadConstraint);

    @PUT("topologySpreadConstraint/{id}")
    Call<TopologySpreadConstraint> update(@Path("id") String id, @Body TopologySpreadConstraint topologySpreadConstraint);

    @DELETE("topologySpreadConstraint/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
