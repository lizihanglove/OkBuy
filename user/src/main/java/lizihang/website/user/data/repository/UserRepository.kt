package lizihang.website.user.data.repository

import lizihang.website.base.data.net.RetrofitFactory
import lizihang.website.base.data.protocal.BaseResponse
import lizihang.website.user.data.api.UserApi
import lizihang.website.user.data.protocal.RegisterRequest
import rx.Observable

/**
 * @author lizihanglove
 * @date  2018/1/1
 * @email one_mighty@163.com
 * @desc 业务处理单元
 */
open class UserRepository {
    fun register(mobile: String, verifyCode: String, password: String): Observable<BaseResponse<String>> {
        return RetrofitFactory.instance
                .create(UserApi::class.java)
                .register(RegisterRequest(mobile, verifyCode, password))
    }
}