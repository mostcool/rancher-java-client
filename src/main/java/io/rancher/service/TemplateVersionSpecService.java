package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.TemplateVersionSpec;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface TemplateVersionSpecService {

    @GET("templateVersionSpec")
    Call<TypeCollection<TemplateVersionSpec>> list();

    @GET("templateVersionSpec")
    Call<TypeCollection<TemplateVersionSpec>> list(@QueryMap Filters filters);

    @GET("templateVersionSpec/{id}")
    Call<TemplateVersionSpec> get(@Path("id") String id);

    @POST("templateVersionSpec")
    Call<TemplateVersionSpec> create(@Body TemplateVersionSpec templateVersionSpec);

    @PUT("templateVersionSpec/{id}")
    Call<TemplateVersionSpec> update(@Path("id") String id, @Body TemplateVersionSpec templateVersionSpec);

    @DELETE("templateVersionSpec/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
