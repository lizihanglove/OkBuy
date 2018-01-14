package lizihang.website.base.ui.activity

import lizihang.website.base.presenter.BasePresenter
import lizihang.website.base.presenter.view.BaseView

/**
 * @author lizihanglove
 * @date  2017/12/31
 * @email one_mighty@163.com
 * @desc MVP架构activity基类
 */
open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {
    override fun showLoading() {

    }

    override fun dismissLoading() {
    }

    override fun onError() {
    }

    lateinit var mPresenter: T
}