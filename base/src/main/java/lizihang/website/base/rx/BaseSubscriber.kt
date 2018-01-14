package lizihang.website.base.rx

import rx.Subscriber

/**
 * @author lizihanglove
 * @date  2018/1/1
 * @email one_mighty@163.com
 * @desc 所有订阅者的基类
 */
open class BaseSubscriber<T> : Subscriber<T>() {
    override fun onNext(t: T) {
    }

    override fun onCompleted() {
    }

    override fun onError(e: Throwable?) {
    }
}