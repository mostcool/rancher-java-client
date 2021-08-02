package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.BitbucketServerApplyInput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface BitbucketServerApplyInputService {

    @GET("bitbucketServerApplyInput")
    Call<TypeCollection<BitbucketServerApplyInput>> list();

    @GET("bitbucketServerApplyInput")
    Call<TypeCollection<BitbucketServerApplyInput>> list(@QueryMap Filters filters);

    @GET("bitbucketServerApplyInput/{id}")
    Call<BitbucketServerApplyInput> get(@Path("id") String id);

    @POST("bitbucketServerApplyInput")
    Call<BitbucketServerApplyInput> create(@Body BitbucketServerApplyInput bitbucketServerApplyInput);

    @PUT("bitbucketServerApplyInput/{id}")
    Call<BitbucketServerApplyInput> update(@Path("id") String id, @Body BitbucketServerApplyInput bitbucketServerApplyInput);

    @DELETE("bitbucketServerApplyInput/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
