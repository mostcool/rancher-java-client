package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SmtpConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SmtpConfigService {

    @GET("smtpConfig")
    Call<TypeCollection<SmtpConfig>> list();

    @GET("smtpConfig")
    Call<TypeCollection<SmtpConfig>> list(@QueryMap Filters filters);

    @GET("smtpConfig/{id}")
    Call<SmtpConfig> get(@Path("id") String id);

    @POST("smtpConfig")
    Call<SmtpConfig> create(@Body SmtpConfig smtpConfig);

    @PUT("smtpConfig/{id}")
    Call<SmtpConfig> update(@Path("id") String id, @Body SmtpConfig smtpConfig);

    @DELETE("smtpConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
