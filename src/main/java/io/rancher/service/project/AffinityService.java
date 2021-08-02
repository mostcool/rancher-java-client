package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Affinity;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AffinityService {

    @GET("affinity")
    Call<TypeCollection<Affinity>> list();

    @GET("affinity")
    Call<TypeCollection<Affinity>> list(@QueryMap Filters filters);

    @GET("affinity/{id}")
    Call<Affinity> get(@Path("id") String id);

    @POST("affinity")
    Call<Affinity> create(@Body Affinity affinity);

    @PUT("affinity/{id}")
    Call<Affinity> update(@Path("id") String id, @Body Affinity affinity);

    @DELETE("affinity/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
