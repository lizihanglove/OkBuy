package lizihang.website.base.presenter.view

/**
 * @author lizihanglove
 * @date  2017/12/31
 * @email one_mighty@163.com
 * @desc view 父接口
 */
interface BaseView {
    /**
     * 展示加载视图
     */
    fun showLoading()

    /**
     * 取消加载视图
     */
    fun dismissLoading()

    /**
     * 错误回调
     */
    fun onError()
}