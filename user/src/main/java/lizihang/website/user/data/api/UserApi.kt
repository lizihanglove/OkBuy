package lizihang.website.user.data.api

import lizihang.website.base.data.protocal.BaseResponse
import lizihang.website.user.data.protocal.RegisterRequest
import retrofit2.http.Body
import retrofit2.http.POST
import rx.Observable

/**
 * @author lizihanglove
 * @date  2018/1/1
 * @email one_mighty@163.com
 * @desc 网络数据请求接口
 */
interface UserApi {
    @POST("userCenter/register")
    fun register(@Body request: RegisterRequest):Observable<BaseResponse<String>>
}