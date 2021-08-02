package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Amazonec2credentialconfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface Amazonec2credentialconfigService {

    @GET("amazonec2credentialconfig")
    Call<TypeCollection<Amazonec2credentialconfig>> list();

    @GET("amazonec2credentialconfig")
    Call<TypeCollection<Amazonec2credentialconfig>> list(@QueryMap Filters filters);

    @GET("amazonec2credentialconfig/{id}")
    Call<Amazonec2credentialconfig> get(@Path("id") String id);

    @POST("amazonec2credentialconfig")
    Call<Amazonec2credentialconfig> create(@Body Amazonec2credentialconfig amazonec2credentialconfig);

    @PUT("amazonec2credentialconfig/{id}")
    Call<Amazonec2credentialconfig> update(@Path("id") String id, @Body Amazonec2credentialconfig amazonec2credentialconfig);

    @DELETE("amazonec2credentialconfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
