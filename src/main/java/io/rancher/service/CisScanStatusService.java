package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CisScanStatus;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface CisScanStatusService {

    @GET("cisScanStatus")
    Call<TypeCollection<CisScanStatus>> list();

    @GET("cisScanStatus")
    Call<TypeCollection<CisScanStatus>> list(@QueryMap Filters filters);

    @GET("cisScanStatus/{id}")
    Call<CisScanStatus> get(@Path("id") String id);

    @POST("cisScanStatus")
    Call<CisScanStatus> create(@Body CisScanStatus cisScanStatus);

    @PUT("cisScanStatus/{id}")
    Call<CisScanStatus> update(@Path("id") String id, @Body CisScanStatus cisScanStatus);

    @DELETE("cisScanStatus/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
