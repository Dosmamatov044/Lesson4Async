package com.example.lesson4async

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.PersistableBundle
import android.util.Log
import androidx.activity.viewModels
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

class MainActivity : AppCompatActivity() {

    val isFinish=true





    val viewModel:MyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)







        val r: Deferred<Int> = CoroutineScope(Dispatchers.IO).async {


            var i = 0
            if (isFinish){

                i=4
            }else{
               i=5

            }






            i
        }





        runBlocking {
data.collect{

Log.d("moss",it)

}


                Log.d("ololo", r.await().toString())




        }

    }

  suspend fun loop(){



      for (i in 0 ..6){


          delay(4000)

          Log.d("ololo",i.toString())

      }




   }


    val data= flow {


if (isFinish){

    emit("Успех")

     }else {

    emit("Провал")
}
   }.flowOn(Dispatchers.IO)







}