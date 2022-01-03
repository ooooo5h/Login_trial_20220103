package com.neppplus.login_trial_20220103

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {

            val inputEmail = edtEmail.text.toString()
            val inputPassword = edtPassword.text.toString()

            if (inputEmail == "admin@test.com" && inputPassword == "qwer1234") {
                Toast.makeText(this, "관리자님 환영합니다", Toast.LENGTH_SHORT).show()
            }
            else if (inputPassword == "qwer1234"){
                Toast.makeText(this, "잘못된 아이디입니다.", Toast.LENGTH_SHORT).show()
            }
            else if (inputEmail == "admin@test.com") {
                Toast.makeText(this, "비밀번호를 확인해주세요.", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "없는 정보입니다. 확인해주세요.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}