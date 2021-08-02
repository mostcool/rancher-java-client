package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SaveAsTemplateOutput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SaveAsTemplateOutputService {

    @GET("saveAsTemplateOutput")
    Call<TypeCollection<SaveAsTemplateOutput>> list();

    @GET("saveAsTemplateOutput")
    Call<TypeCollection<SaveAsTemplateOutput>> list(@QueryMap Filters filters);

    @GET("saveAsTemplateOutput/{id}")
    Call<SaveAsTemplateOutput> get(@Path("id") String id);

    @POST("saveAsTemplateOutput")
    Call<SaveAsTemplateOutput> create(@Body SaveAsTemplateOutput saveAsTemplateOutput);

    @PUT("saveAsTemplateOutput/{id}")
    Call<SaveAsTemplateOutput> update(@Path("id") String id, @Body SaveAsTemplateOutput saveAsTemplateOutput);

    @DELETE("saveAsTemplateOutput/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
