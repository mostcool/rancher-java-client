package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.SshAuth;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SshAuthService {

    @GET("sshAuth")
    Call<TypeCollection<SshAuth>> list();

    @GET("sshAuth")
    Call<TypeCollection<SshAuth>> list(@QueryMap Filters filters);

    @GET("sshAuth/{id}")
    Call<SshAuth> get(@Path("id") String id);

    @POST("sshAuth")
    Call<SshAuth> create(@Body SshAuth sshAuth);

    @PUT("sshAuth/{id}")
    Call<SshAuth> update(@Path("id") String id, @Body SshAuth sshAuth);

    @DELETE("sshAuth/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
