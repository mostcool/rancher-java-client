package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.DnsRecord;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface DnsRecordService {

    @GET("dnsRecord")
    Call<TypeCollection<DnsRecord>> list();

    @GET("dnsRecord")
    Call<TypeCollection<DnsRecord>> list(@QueryMap Filters filters);

    @GET("dnsRecord/{id}")
    Call<DnsRecord> get(@Path("id") String id);

    @POST("dnsRecord")
    Call<DnsRecord> create(@Body DnsRecord dnsRecord);

    @PUT("dnsRecord/{id}")
    Call<DnsRecord> update(@Path("id") String id, @Body DnsRecord dnsRecord);

    @DELETE("dnsRecord/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
