package com.example.android.sigunpandlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_guest.setOnClickListener {
            val intent = Intent(this, Name_Number_activity::class.java)
            startActivity(intent)
        }
    }
}
