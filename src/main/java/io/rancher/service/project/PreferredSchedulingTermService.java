package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PreferredSchedulingTerm;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface PreferredSchedulingTermService {

    @GET("preferredSchedulingTerm")
    Call<TypeCollection<PreferredSchedulingTerm>> list();

    @GET("preferredSchedulingTerm")
    Call<TypeCollection<PreferredSchedulingTerm>> list(@QueryMap Filters filters);

    @GET("preferredSchedulingTerm/{id}")
    Call<PreferredSchedulingTerm> get(@Path("id") String id);

    @POST("preferredSchedulingTerm")
    Call<PreferredSchedulingTerm> create(@Body PreferredSchedulingTerm preferredSchedulingTerm);

    @PUT("preferredSchedulingTerm/{id}")
    Call<PreferredSchedulingTerm> update(@Path("id") String id, @Body PreferredSchedulingTerm preferredSchedulingTerm);

    @DELETE("preferredSchedulingTerm/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
