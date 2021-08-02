package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.HttpSettings;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface HttpSettingsService {

    @GET("httpSettings")
    Call<TypeCollection<HttpSettings>> list();

    @GET("httpSettings")
    Call<TypeCollection<HttpSettings>> list(@QueryMap Filters filters);

    @GET("httpSettings/{id}")
    Call<HttpSettings> get(@Path("id") String id);

    @POST("httpSettings")
    Call<HttpSettings> create(@Body HttpSettings httpSettings);

    @PUT("httpSettings/{id}")
    Call<HttpSettings> update(@Path("id") String id, @Body HttpSettings httpSettings);

    @DELETE("httpSettings/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
