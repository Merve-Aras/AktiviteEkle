package com.mervearas.aktiviteekle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        //getintent ile mainaktivity'deki verileri karşılama

        val intent = intent // intent değişkenini getintent özellikli intent'e eşitledik
        val username = intent.getStringExtra("username") // getintent özellğine sahip oluşturulan val intent'in içinden getStringExtra seçilir çünkü mainactivity bölümünden username isimli string veri gönderilecek.
        val name = intent.getStringExtra("name") //getintent özellğine sahip oluşturulan val intent'in içinden getStringExtra seçilir çünkü mainactivity bölümünden name isimli string veri gönderilecek.
        userNameTextNextActivity.text = "Username:  " + username //username içindeki veriyi textview içine yazdırır.
        nameTextNextActivity.text = "Name:  " + name  //username içindeki veriyi textview içine yazdırır.
    }
}