package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Group;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface GroupService {

    @GET("group")
    Call<TypeCollection<Group>> list();

    @GET("group")
    Call<TypeCollection<Group>> list(@QueryMap Filters filters);

    @GET("group/{id}")
    Call<Group> get(@Path("id") String id);

    @POST("group")
    Call<Group> create(@Body Group group);

    @PUT("group/{id}")
    Call<Group> update(@Path("id") String id, @Body Group group);

    @DELETE("group/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
