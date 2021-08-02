package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.AlertingSpec;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AlertingSpecService {

    @GET("alertingSpec")
    Call<TypeCollection<AlertingSpec>> list();

    @GET("alertingSpec")
    Call<TypeCollection<AlertingSpec>> list(@QueryMap Filters filters);

    @GET("alertingSpec/{id}")
    Call<AlertingSpec> get(@Path("id") String id);

    @POST("alertingSpec")
    Call<AlertingSpec> create(@Body AlertingSpec alertingSpec);

    @PUT("alertingSpec/{id}")
    Call<AlertingSpec> update(@Path("id") String id, @Body AlertingSpec alertingSpec);

    @DELETE("alertingSpec/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
