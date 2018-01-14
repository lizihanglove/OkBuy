package lizihang.website.user.presenter

import lizihang.website.base.ext.execute
import lizihang.website.base.presenter.BasePresenter
import lizihang.website.base.rx.BaseSubscriber
import lizihang.website.user.presenter.view.RegisterView
import lizihang.website.user.service.UserService
import lizihang.website.user.service.impl.UserServiceImpl
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * @author lizihanglove
 * @date  2017/12/31
 * @email one_mighty@163.com
 * @desc 注册的业务回调
 */
class RegisterPresenter : BasePresenter<RegisterView>() {
    /**
     * 注册
     */
    fun register(mobile: String, verifyCode: String, password: String) {
        /*
        业务逻辑
         */
        val userService = UserServiceImpl()
        userService.register(mobile, verifyCode, password)
                .execute(object : BaseSubscriber<Boolean>() {
                    override fun onNext(t: Boolean) {
                        mView.onRegisterResult(t)
                    }
                })


    }
}