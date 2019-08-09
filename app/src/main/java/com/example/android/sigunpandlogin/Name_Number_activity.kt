package com.example.android.sigunpandlogin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.name_number_2.*

class Name_Number_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.name_number_2)
        iv_back.setOnClickListener{
            finish()
        }
    }
}
