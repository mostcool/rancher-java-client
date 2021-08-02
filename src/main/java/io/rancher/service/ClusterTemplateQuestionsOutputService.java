package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterTemplateQuestionsOutput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ClusterTemplateQuestionsOutputService {

    @GET("clusterTemplateQuestionsOutput")
    Call<TypeCollection<ClusterTemplateQuestionsOutput>> list();

    @GET("clusterTemplateQuestionsOutput")
    Call<TypeCollection<ClusterTemplateQuestionsOutput>> list(@QueryMap Filters filters);

    @GET("clusterTemplateQuestionsOutput/{id}")
    Call<ClusterTemplateQuestionsOutput> get(@Path("id") String id);

    @POST("clusterTemplateQuestionsOutput")
    Call<ClusterTemplateQuestionsOutput> create(@Body ClusterTemplateQuestionsOutput clusterTemplateQuestionsOutput);

    @PUT("clusterTemplateQuestionsOutput/{id}")
    Call<ClusterTemplateQuestionsOutput> update(@Path("id") String id, @Body ClusterTemplateQuestionsOutput clusterTemplateQuestionsOutput);

    @DELETE("clusterTemplateQuestionsOutput/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
