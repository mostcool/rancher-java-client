package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.TemplateVersionStatus;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

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
    Call<Response> delete(@Path("id") String id);
    
}
