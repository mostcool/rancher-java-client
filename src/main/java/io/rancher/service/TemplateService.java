package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Template;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface TemplateService {

    @GET("template")
    Call<TypeCollection<Template>> list();

    @GET("template")
    Call<TypeCollection<Template>> list(@QueryMap Filters filters);

    @GET("template/{id}")
    Call<Template> get(@Path("id") String id);

    @POST("template")
    Call<Template> create(@Body Template template);

    @PUT("template/{id}")
    Call<Template> update(@Path("id") String id, @Body Template template);

    @DELETE("template/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
