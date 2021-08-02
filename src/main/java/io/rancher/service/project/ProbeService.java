package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Probe;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ProbeService {

    @GET("probe")
    Call<TypeCollection<Probe>> list();

    @GET("probe")
    Call<TypeCollection<Probe>> list(@QueryMap Filters filters);

    @GET("probe/{id}")
    Call<Probe> get(@Path("id") String id);

    @POST("probe")
    Call<Probe> create(@Body Probe probe);

    @PUT("probe/{id}")
    Call<Probe> update(@Path("id") String id, @Body Probe probe);

    @DELETE("probe/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
