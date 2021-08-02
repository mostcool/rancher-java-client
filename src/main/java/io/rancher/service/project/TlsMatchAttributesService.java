package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.TlsMatchAttributes;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface TlsMatchAttributesService {

    @GET("tlsMatchAttributes")
    Call<TypeCollection<TlsMatchAttributes>> list();

    @GET("tlsMatchAttributes")
    Call<TypeCollection<TlsMatchAttributes>> list(@QueryMap Filters filters);

    @GET("tlsMatchAttributes/{id}")
    Call<TlsMatchAttributes> get(@Path("id") String id);

    @POST("tlsMatchAttributes")
    Call<TlsMatchAttributes> create(@Body TlsMatchAttributes tlsMatchAttributes);

    @PUT("tlsMatchAttributes/{id}")
    Call<TlsMatchAttributes> update(@Path("id") String id, @Body TlsMatchAttributes tlsMatchAttributes);

    @DELETE("tlsMatchAttributes/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
