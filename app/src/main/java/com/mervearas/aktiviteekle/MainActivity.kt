package com.mervearas.aktiviteekle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun next (view: View){

        val intent = Intent(applicationContext,NextActivity::class.java)  //bir sonraki aktivite sayfasına geçmek için Intent kullanılır. Intent içerisine ilk olarak context ve ikinci olarak gidilmek istenen class ismi yazılıp yazılan class bilgisinin sonuna ::class.java eklenir.
        intent.putExtra("username",userNameText.text.toString()) //userNameText id'li yerdeki veriyi sonraki aktivite sayfasına göndermeyi sağlar. Gönderilecek aktivite sayfasından bu verileri karşılamak için kod yazılmalıdır. Bu küçük harflerle yazılan intent (getintent) ile yapılır.
        intent.putExtra("name",nameText.text.toString()) //nameText id'li yerdeki veriyi sonraki aktivite sayfasına göndermeyi sağlar. Gönderilecek aktivite sayfasından bu verileri karşılamak için kod yazılmalıdır. Bu küçük harflerle yazılan intent (getintent) ile yapılır.
        startActivity(intent) // üstteki kod yazıldıktan sonra aktivitenin başlatılması için bu kod yazılır.
        //finish() eğer bir sonraki aktivite sayfasına gittikten sonra bir daha kullanıcı geri dönemesin istiyorsak finish yapılarak ilk sayfanın destroy edilmesi sağlanabilir.
        //aktivite yaşam döngüsü konusunda destroy anlatılıyor.

    }
}