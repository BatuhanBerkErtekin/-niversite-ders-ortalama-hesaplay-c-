package com.batuhanberkertekin.kotlincalculatormy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_carpma.*

class CarpmaActivity : AppCompatActivity() {



    var   sayi1 : Int? = null
    var   sayi2 : Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carpma)
    }









    fun Carpma(view : View) {


        sayi1 = editTextTextPersonName1.text.toString().toIntOrNull()
        sayi2 = editTextTextPersonName2.text.toString().toIntOrNull()

        var sonuc = sayi1!! * sayi2!!


        if (sayi1 == null || sayi2 == null) {

            textView2.text = "LÜTFEN BOŞ BIRAKMAYIN"


        } else {


            textView2.text = "SONUCUNUZ : " + sonuc


        }
    }

        fun Back(view :View){



            val intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }











    }



