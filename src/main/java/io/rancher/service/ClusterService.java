package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Cluster;
import io.rancher.type.RotateCertificateInput;
import io.rancher.type.GenerateKubeConfigOutput;
import io.rancher.type.ExportOutput;
import io.rancher.type.RotateCertificateOutput;
import io.rancher.type.SaveAsTemplateInput;
import io.rancher.type.SaveAsTemplateOutput;
import io.rancher.type.MonitoringOutput;
import io.rancher.type.ImportClusterYamlInput;
import io.rancher.type.ImportYamlOutput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

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
    Call<Response> delete(@Path("id") String id);
    
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
