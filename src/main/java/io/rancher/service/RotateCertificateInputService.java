package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RotateCertificateInput;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface RotateCertificateInputService {

    @GET("rotateCertificateInput")
    Call<TypeCollection<RotateCertificateInput>> list();

    @GET("rotateCertificateInput")
    Call<TypeCollection<RotateCertificateInput>> list(@QueryMap Filters filters);

    @GET("rotateCertificateInput/{id}")
    Call<RotateCertificateInput> get(@Path("id") String id);

    @POST("rotateCertificateInput")
    Call<RotateCertificateInput> create(@Body RotateCertificateInput rotateCertificateInput);

    @PUT("rotateCertificateInput/{id}")
    Call<RotateCertificateInput> update(@Path("id") String id, @Body RotateCertificateInput rotateCertificateInput);

    @DELETE("rotateCertificateInput/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
