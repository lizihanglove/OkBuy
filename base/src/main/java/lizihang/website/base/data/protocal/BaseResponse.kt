package lizihang.website.base.data.protocal

/**
 * @author lizihanglove
 * @date  2018/1/1
 * @email one_mighty@163.com
 * @desc 数据请求返回数据的基类
 */
open class BaseResponse<out T>(val status:Int,val message:String,val data:T ) {

}