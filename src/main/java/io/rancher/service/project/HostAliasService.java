package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.HostAlias;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface HostAliasService {

    @GET("hostAlias")
    Call<TypeCollection<HostAlias>> list();

    @GET("hostAlias")
    Call<TypeCollection<HostAlias>> list(@QueryMap Filters filters);

    @GET("hostAlias/{id}")
    Call<HostAlias> get(@Path("id") String id);

    @POST("hostAlias")
    Call<HostAlias> create(@Body HostAlias hostAlias);

    @PUT("hostAlias/{id}")
    Call<HostAlias> update(@Path("id") String id, @Body HostAlias hostAlias);

    @DELETE("hostAlias/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
