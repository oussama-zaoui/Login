package com.example.ouss.login

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_2.*

/**
 * Created by ouss on 17/06/18.
 */
class Activity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

            button3.setOnClickListener({
                val intent = Intent(this@Activity2, MainActivity::class.java)
                intent.putExtra("username", editText3.text.toString())
                if(editText4.text.toString().equals(editText5.text.toString())) {
                    intent.putExtra("password", editText4.text.toString())
                    startActivity(intent)
                }else{Toast.makeText(this,"check your password",Toast.LENGTH_LONG).show()}
            })


        }

    }

