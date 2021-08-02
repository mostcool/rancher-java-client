package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SubQuestion;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SubQuestionService {

    @GET("subQuestion")
    Call<TypeCollection<SubQuestion>> list();

    @GET("subQuestion")
    Call<TypeCollection<SubQuestion>> list(@QueryMap Filters filters);

    @GET("subQuestion/{id}")
    Call<SubQuestion> get(@Path("id") String id);

    @POST("subQuestion")
    Call<SubQuestion> create(@Body SubQuestion subQuestion);

    @PUT("subQuestion/{id}")
    Call<SubQuestion> update(@Path("id") String id, @Body SubQuestion subQuestion);

    @DELETE("subQuestion/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
