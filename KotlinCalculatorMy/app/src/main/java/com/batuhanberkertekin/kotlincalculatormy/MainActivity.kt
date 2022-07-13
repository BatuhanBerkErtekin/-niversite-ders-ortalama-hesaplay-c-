package com.batuhanberkertekin.kotlincalculatormy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*






class MainActivity : AppCompatActivity() {


     var  number1 :Int? = null
    var number2 :Int ? = null
    var sonuc : Int ? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)







    }



 /*  fun toplama(view :View){


       number1 = editText1.text.toString().toIntOrNull()
       number2 = editText2.text.toString().toIntOrNull()



       if( number1 == null || number2 == null){

           textView.text = "ERROR LÜTFEN DEĞER GİRİNİZ"
       }else{

           var toplama = number1!! + number2!!

           textView.text = "SONUC " + toplama

       }







   }
    fun bolme(view :View){

    }

      fun cikarma(view :View){

      }


    fun carpma(view: View){

    }

  */


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

      val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu,menu)
        return  true








    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {




        return  when(item.itemId){
            R.id.Carpma -> {
               val intent = Intent(applicationContext,CarpmaActivity::class.java)
                startActivity(intent)

                true
            }

            else -> super.onOptionsItemSelected(item)
        }






    }
}