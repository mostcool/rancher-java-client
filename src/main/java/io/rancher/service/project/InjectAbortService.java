package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.InjectAbort;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface InjectAbortService {

    @GET("injectAbort")
    Call<TypeCollection<InjectAbort>> list();

    @GET("injectAbort")
    Call<TypeCollection<InjectAbort>> list(@QueryMap Filters filters);

    @GET("injectAbort/{id}")
    Call<InjectAbort> get(@Path("id") String id);

    @POST("injectAbort")
    Call<InjectAbort> create(@Body InjectAbort injectAbort);

    @PUT("injectAbort/{id}")
    Call<InjectAbort> update(@Path("id") String id, @Body InjectAbort injectAbort);

    @DELETE("injectAbort/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
