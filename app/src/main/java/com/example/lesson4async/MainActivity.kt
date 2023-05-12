package com.example.lesson4async

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.PersistableBundle
import android.util.Log
import androidx.activity.viewModels
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
//SharedFlow  добавить в проэкт по ретрофиту
//добавить кнопку start которы начинает цикл от одного до 20 (Показывать в textVIew с задержко в секунду )
//добавить кнопку stop ,при нажати остановить цикл и показать в textView 0

    val viewModel:MyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        viewModel.liveData.observe(this){



        }





  /* val job=  CoroutineScope(Dispatchers.IO).launch {


         loop()
         loop()



     }

*/

   //val i=   GlobalScope.launch(Dispatchers.IO ){



 //     }




     val r:Deferred<Int> =   CoroutineScope(Dispatchers.IO).async{

        launch {


        }

       val i=  4

         i
     }

     // setPhoto()







        runBlocking {


            async(Dispatchers.IO) {


            }



            launch(Dispatchers.IO) {
            }






            launch(Dispatchers.Main) {


            }

        }








    }



  suspend fun loop(){



      for (i in 0 ..6){


          delay(4000)

          Log.d("ololo",i.toString())

      }




   }


    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
    }

    override fun onRestoreInstanceState(
        savedInstanceState: Bundle?,
        persistentState: PersistableBundle?
    ) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
    }


    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }


}