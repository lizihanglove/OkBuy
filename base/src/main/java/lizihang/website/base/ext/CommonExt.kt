package lizihang.website.base.ext

import lizihang.website.base.rx.BaseSubscriber
import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * @author lizihanglove
 * @date  2018/1/1
 * @email one_mighty@163.com
 * @desc 类的扩展方法
 */

fun <T> Observable<T>.execute(subscriber: BaseSubscriber<T>){
    this.observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(subscriber)
}
