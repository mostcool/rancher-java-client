package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Vmwarevspherecredentialconfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface VmwarevspherecredentialconfigService {

    @GET("vmwarevspherecredentialconfig")
    Call<TypeCollection<Vmwarevspherecredentialconfig>> list();

    @GET("vmwarevspherecredentialconfig")
    Call<TypeCollection<Vmwarevspherecredentialconfig>> list(@QueryMap Filters filters);

    @GET("vmwarevspherecredentialconfig/{id}")
    Call<Vmwarevspherecredentialconfig> get(@Path("id") String id);

    @POST("vmwarevspherecredentialconfig")
    Call<Vmwarevspherecredentialconfig> create(@Body Vmwarevspherecredentialconfig vmwarevspherecredentialconfig);

    @PUT("vmwarevspherecredentialconfig/{id}")
    Call<Vmwarevspherecredentialconfig> update(@Path("id") String id, @Body Vmwarevspherecredentialconfig vmwarevspherecredentialconfig);

    @DELETE("vmwarevspherecredentialconfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
