package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.TemplateStatus;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface TemplateStatusService {

    @GET("templateStatus")
    Call<TypeCollection<TemplateStatus>> list();

    @GET("templateStatus")
    Call<TypeCollection<TemplateStatus>> list(@QueryMap Filters filters);

    @GET("templateStatus/{id}")
    Call<TemplateStatus> get(@Path("id") String id);

    @POST("templateStatus")
    Call<TemplateStatus> create(@Body TemplateStatus templateStatus);

    @PUT("templateStatus/{id}")
    Call<TemplateStatus> update(@Path("id") String id, @Body TemplateStatus templateStatus);

    @DELETE("templateStatus/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
