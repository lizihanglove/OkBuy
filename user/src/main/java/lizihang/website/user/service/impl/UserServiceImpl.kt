package lizihang.website.user.service.impl

import lizihang.website.base.data.protocal.BaseResponse
import lizihang.website.base.rx.BaseException
import lizihang.website.user.data.repository.UserRepository
import lizihang.website.user.service.UserService
import rx.Observable
import rx.functions.Func1

/**
 * @author lizihanglove
 * @date  2018/1/1
 * @email one_mighty@163.com
 * @desc 用户模块业务实现
 */
class UserServiceImpl : UserService {
    override fun register(mobile: String, verifyCode: String, password: String): Observable<Boolean> {
        val userRepository = UserRepository()
        return userRepository.register(mobile, verifyCode, password)
                .flatMap(object : Func1<BaseResponse<String>, Observable<Boolean>> {
                    override fun call(t: BaseResponse<String>): Observable<Boolean> {
                        return if (t.status != 0) {
                            Observable.error(BaseException(t.status, t.message))
                        } else {
                            Observable.just(false)
                        }
                    }
                })
    }
}
