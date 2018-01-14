package lizihang.website.user.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_login)
        toast("${intent.getIntExtra("id", 0)}")
        verticalLayout {
            padding = 30
            editText {
                hint = "name"
                textSize = 20f
            }
            editText {
                hint = "password"
                textSize = 20f
            }
            button {
                text = "登录"
                onClick {
                    toast("登录成功")
                }
            }

        }


    }
}
