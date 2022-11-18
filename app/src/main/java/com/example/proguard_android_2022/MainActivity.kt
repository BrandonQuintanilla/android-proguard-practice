package com.example.proguard_android_2022

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proguard_android_2022.user.UserPrueba

class MainActivity : AppCompatActivity() {

    var user: UserPrueba? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        user = UserPrueba()
        user?.getEmailProfessor()
        user?.setEmailProfessor("alberto")
    }
}