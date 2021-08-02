package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SearchPrincipalsInput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SearchPrincipalsInputService {

    @GET("searchPrincipalsInput")
    Call<TypeCollection<SearchPrincipalsInput>> list();

    @GET("searchPrincipalsInput")
    Call<TypeCollection<SearchPrincipalsInput>> list(@QueryMap Filters filters);

    @GET("searchPrincipalsInput/{id}")
    Call<SearchPrincipalsInput> get(@Path("id") String id);

    @POST("searchPrincipalsInput")
    Call<SearchPrincipalsInput> create(@Body SearchPrincipalsInput searchPrincipalsInput);

    @PUT("searchPrincipalsInput/{id}")
    Call<SearchPrincipalsInput> update(@Path("id") String id, @Body SearchPrincipalsInput searchPrincipalsInput);

    @DELETE("searchPrincipalsInput/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
