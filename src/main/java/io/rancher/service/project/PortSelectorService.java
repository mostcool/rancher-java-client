package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PortSelector;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PortSelectorService {

    @GET("portSelector")
    Call<TypeCollection<PortSelector>> list();

    @GET("portSelector")
    Call<TypeCollection<PortSelector>> list(@QueryMap Filters filters);

    @GET("portSelector/{id}")
    Call<PortSelector> get(@Path("id") String id);

    @POST("portSelector")
    Call<PortSelector> create(@Body PortSelector portSelector);

    @PUT("portSelector/{id}")
    Call<PortSelector> update(@Path("id") String id, @Body PortSelector portSelector);

    @DELETE("portSelector/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
