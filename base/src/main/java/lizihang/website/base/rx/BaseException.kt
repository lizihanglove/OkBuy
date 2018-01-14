package lizihang.website.base.rx

/**
 * @author lizihanglove
 * @date  2018/1/1
 * @email one_mighty@163.com
 * @desc 异常基类
 */
class BaseException(val status: Int, val msg: String) : Throwable() {
}