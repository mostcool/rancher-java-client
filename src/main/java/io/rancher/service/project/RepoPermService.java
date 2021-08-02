package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.RepoPerm;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface RepoPermService {

    @GET("repoPerm")
    Call<TypeCollection<RepoPerm>> list();

    @GET("repoPerm")
    Call<TypeCollection<RepoPerm>> list(@QueryMap Filters filters);

    @GET("repoPerm/{id}")
    Call<RepoPerm> get(@Path("id") String id);

    @POST("repoPerm")
    Call<RepoPerm> create(@Body RepoPerm repoPerm);

    @PUT("repoPerm/{id}")
    Call<RepoPerm> update(@Path("id") String id, @Body RepoPerm repoPerm);

    @DELETE("repoPerm/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
