package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.NamespacedCertificate;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface NamespacedCertificateService {

    @GET("namespacedCertificate")
    Call<TypeCollection<NamespacedCertificate>> list();

    @GET("namespacedCertificate")
    Call<TypeCollection<NamespacedCertificate>> list(@QueryMap Filters filters);

    @GET("namespacedCertificate/{id}")
    Call<NamespacedCertificate> get(@Path("id") String id);

    @POST("namespacedCertificate")
    Call<NamespacedCertificate> create(@Body NamespacedCertificate namespacedCertificate);

    @PUT("namespacedCertificate/{id}")
    Call<NamespacedCertificate> update(@Path("id") String id, @Body NamespacedCertificate namespacedCertificate);

    @DELETE("namespacedCertificate/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
