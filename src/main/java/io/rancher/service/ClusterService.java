package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.*;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ClusterService {

    @GET("cluster")
    Call<TypeCollection<Cluster>> list();

    @GET("cluster")
    Call<TypeCollection<Cluster>> list(@QueryMap Filters filters);

    @GET("cluster/{id}")
    Call<Cluster> get(@Path("id") String id);

    @POST("cluster")
    Call<Cluster> create(@Body Cluster cluster);

    @PUT("cluster/{id}")
    Call<Cluster> update(@Path("id") String id, @Body Cluster cluster);

    @DELETE("cluster/{id}")
    Call<ResponseBody> delete(@Path("id") String id);

    @POST("cluster/{id}?action=exportYaml")
    Call<ExportOutput> exportYaml(@Path("id") String id);

    @POST("cluster/{id}?action=generateKubeconfig")
    Call<GenerateKubeConfigOutput> generateKubeconfig(@Path("id") String id);

    @POST("cluster/{id}?action=importYaml")
    Call<ImportYamlOutput> importYaml(@Path("id") String id, @Body ImportClusterYamlInput importClusterYamlInput);

    @POST("cluster/{id}?action=rotateCertificates")
    Call<RotateCertificateOutput> rotateCertificates(@Path("id") String id, @Body RotateCertificateInput rotateCertificateInput);

    @POST("cluster/{id}?action=saveAsTemplate")
    Call<SaveAsTemplateOutput> saveAsTemplate(@Path("id") String id, @Body SaveAsTemplateInput saveAsTemplateInput);

    @POST("cluster/{id}?action=viewMonitoring")
    Call<MonitoringOutput> viewMonitoring(@Path("id") String id);
}
