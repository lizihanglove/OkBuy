package lizihang.website.user.service

import rx.Observable

/**
 * @author lizihanglove
 * @date  2018/1/1
 * @email one_mighty@163.com
 * @desc 用户模块业务接口
 */
interface UserService {
    fun register(mobile:String,verifyCode:String,password:String):Observable<Boolean>
}