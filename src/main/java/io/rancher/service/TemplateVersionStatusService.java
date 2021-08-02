package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.TemplateVersionStatus;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface TemplateVersionStatusService {

    @GET("templateVersionStatus")
    Call<TypeCollection<TemplateVersionStatus>> list();

    @GET("templateVersionStatus")
    Call<TypeCollection<TemplateVersionStatus>> list(@QueryMap Filters filters);

    @GET("templateVersionStatus/{id}")
    Call<TemplateVersionStatus> get(@Path("id") String id);

    @POST("templateVersionStatus")
    Call<TemplateVersionStatus> create(@Body TemplateVersionStatus templateVersionStatus);

    @PUT("templateVersionStatus/{id}")
    Call<TemplateVersionStatus> update(@Path("id") String id, @Body TemplateVersionStatus templateVersionStatus);

    @DELETE("templateVersionStatus/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
