package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PodAffinityTerm;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PodAffinityTermService {

    @GET("podAffinityTerm")
    Call<TypeCollection<PodAffinityTerm>> list();

    @GET("podAffinityTerm")
    Call<TypeCollection<PodAffinityTerm>> list(@QueryMap Filters filters);

    @GET("podAffinityTerm/{id}")
    Call<PodAffinityTerm> get(@Path("id") String id);

    @POST("podAffinityTerm")
    Call<PodAffinityTerm> create(@Body PodAffinityTerm podAffinityTerm);

    @PUT("podAffinityTerm/{id}")
    Call<PodAffinityTerm> update(@Path("id") String id, @Body PodAffinityTerm podAffinityTerm);

    @DELETE("podAffinityTerm/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
