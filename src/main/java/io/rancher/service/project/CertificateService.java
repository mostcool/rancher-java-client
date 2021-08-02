package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Certificate;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface CertificateService {

    @GET("certificate")
    Call<TypeCollection<Certificate>> list();

    @GET("certificate")
    Call<TypeCollection<Certificate>> list(@QueryMap Filters filters);

    @GET("certificate/{id}")
    Call<Certificate> get(@Path("id") String id);

    @POST("certificate")
    Call<Certificate> create(@Body Certificate certificate);

    @PUT("certificate/{id}")
    Call<Certificate> update(@Path("id") String id, @Body Certificate certificate);

    @DELETE("certificate/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
