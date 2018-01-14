package lizihang.website.user.ui.activity

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*
import lizihang.website.base.ui.activity.BaseMvpActivity
import lizihang.website.user.R
import lizihang.website.user.presenter.RegisterPresenter
import lizihang.website.user.presenter.view.RegisterView
import org.jetbrains.anko.toast

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        mPresenter = RegisterPresenter()
        mPresenter.mView = this
        mRegisterBtn.setOnClickListener {

            mPresenter.register(mMobileEt.text.toString(),
                    mVerifyCodeEt.text.toString(),
                    mPasswordEt.text.toString())
        }

    }

    override fun onRegisterResult(result: Boolean) {
        toast("注册成功！")
    }
}
