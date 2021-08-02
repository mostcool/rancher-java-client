package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.DiskVsphereOpts;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface DiskVsphereOptsService {

    @GET("diskVsphereOpts")
    Call<TypeCollection<DiskVsphereOpts>> list();

    @GET("diskVsphereOpts")
    Call<TypeCollection<DiskVsphereOpts>> list(@QueryMap Filters filters);

    @GET("diskVsphereOpts/{id}")
    Call<DiskVsphereOpts> get(@Path("id") String id);

    @POST("diskVsphereOpts")
    Call<DiskVsphereOpts> create(@Body DiskVsphereOpts diskVsphereOpts);

    @PUT("diskVsphereOpts/{id}")
    Call<DiskVsphereOpts> update(@Path("id") String id, @Body DiskVsphereOpts diskVsphereOpts);

    @DELETE("diskVsphereOpts/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
