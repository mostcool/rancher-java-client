package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.GlobalVsphereOpts;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface GlobalVsphereOptsService {

    @GET("globalVsphereOpts")
    Call<TypeCollection<GlobalVsphereOpts>> list();

    @GET("globalVsphereOpts")
    Call<TypeCollection<GlobalVsphereOpts>> list(@QueryMap Filters filters);

    @GET("globalVsphereOpts/{id}")
    Call<GlobalVsphereOpts> get(@Path("id") String id);

    @POST("globalVsphereOpts")
    Call<GlobalVsphereOpts> create(@Body GlobalVsphereOpts globalVsphereOpts);

    @PUT("globalVsphereOpts/{id}")
    Call<GlobalVsphereOpts> update(@Path("id") String id, @Body GlobalVsphereOpts globalVsphereOpts);

    @DELETE("globalVsphereOpts/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
