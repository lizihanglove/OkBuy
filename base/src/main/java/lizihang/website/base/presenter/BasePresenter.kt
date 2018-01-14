package lizihang.website.base.presenter

import lizihang.website.base.presenter.view.BaseView

/**
 * @author lizihanglove
 * @date  2017/12/31
 * @email one_mighty@163.com
 * @desc presenter基类
 */
open class BasePresenter<T:BaseView> {
    lateinit var mView:T
}