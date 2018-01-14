package lizihang.website.user.presenter.view

import lizihang.website.base.presenter.view.BaseView

/**
 * @author lizihanglove
 * @date  2017/12/31
 * @email one_mighty@163.com
 * @desc 注册的视图回调
 */
 interface RegisterView:BaseView {
    fun onRegisterResult(result:Boolean)
}