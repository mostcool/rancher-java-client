package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.TemplateContent;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface TemplateContentService {

    @GET("templateContent")
    Call<TypeCollection<TemplateContent>> list();

    @GET("templateContent")
    Call<TypeCollection<TemplateContent>> list(@QueryMap Filters filters);

    @GET("templateContent/{id}")
    Call<TemplateContent> get(@Path("id") String id);

    @POST("templateContent")
    Call<TemplateContent> create(@Body TemplateContent templateContent);

    @PUT("templateContent/{id}")
    Call<TemplateContent> update(@Path("id") String id, @Body TemplateContent templateContent);

    @DELETE("templateContent/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
