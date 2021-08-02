package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.IngressTLS;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface IngressTLSService {

    @GET("ingressTLS")
    Call<TypeCollection<IngressTLS>> list();

    @GET("ingressTLS")
    Call<TypeCollection<IngressTLS>> list(@QueryMap Filters filters);

    @GET("ingressTLS/{id}")
    Call<IngressTLS> get(@Path("id") String id);

    @POST("ingressTLS")
    Call<IngressTLS> create(@Body IngressTLS ingressTLS);

    @PUT("ingressTLS/{id}")
    Call<IngressTLS> update(@Path("id") String id, @Body IngressTLS ingressTLS);

    @DELETE("ingressTLS/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
