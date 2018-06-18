package com.example.ouss.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle? ) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener ({

            val intent=Intent(this@MainActivity,Activity2::class.java)
            startActivity(intent)

            })

       val username= intent.getStringExtra("username")
        val password=intent.getStringExtra("password")
        var user=User(username,password)


    var bdd = UserInteraction(this)
    bdd.openForWrite()
    bdd.insertUser(user)

       val array=bdd.allUser as ArrayList<User>
        bdd.close()
       var a=false
        button.setOnClickListener({
            try {


            for(i in 0..array.size){
                if(editText.text.toString().equals(array.get(i).username)&&(editText2.text.toString().equals(array.get(i).password))){
                    a=true
                }

            }}catch (e:Exception){
               e.printStackTrace()
            }

            if (a==true){
                Toast.makeText(this,"BRAVO!!",Toast.LENGTH_LONG).show()
            }else
            Toast.makeText(this,"t pas inscrit",Toast.LENGTH_LONG).show()

        })






    }


}
