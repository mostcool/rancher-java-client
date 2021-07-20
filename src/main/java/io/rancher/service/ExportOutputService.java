package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ExportOutput;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ExportOutputService {

    @GET("exportOutput")
    Call<TypeCollection<ExportOutput>> list();

    @GET("exportOutput")
    Call<TypeCollection<ExportOutput>> list(@QueryMap Filters filters);

    @GET("exportOutput/{id}")
    Call<ExportOutput> get(@Path("id") String id);

    @POST("exportOutput")
    Call<ExportOutput> create(@Body ExportOutput exportOutput);

    @PUT("exportOutput/{id}")
    Call<ExportOutput> update(@Path("id") String id, @Body ExportOutput exportOutput);

    @DELETE("exportOutput/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
