package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.TemplateVersion;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface TemplateVersionService {

    @GET("templateVersion")
    Call<TypeCollection<TemplateVersion>> list();

    @GET("templateVersion")
    Call<TypeCollection<TemplateVersion>> list(@QueryMap Filters filters);

    @GET("templateVersion/{id}")
    Call<TemplateVersion> get(@Path("id") String id);

    @POST("templateVersion")
    Call<TemplateVersion> create(@Body TemplateVersion templateVersion);

    @PUT("templateVersion/{id}")
    Call<TemplateVersion> update(@Path("id") String id, @Body TemplateVersion templateVersion);

    @DELETE("templateVersion/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
