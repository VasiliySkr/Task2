package com.example.task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
               Log.d("MyPoetry", "О сколько нам открытий чудных");

    }

    override fun onStart() {
        super.onStart()
        Log.d("MyPoetry", "Готовят просвещенья дух");
    }

    override fun onResume() {
        super.onResume()
        Log.d("MyPoetry", "И опыт, сын ошибок трудных,");
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyPoetry", "И гений, парадоксов друг,");
    }


    override fun onStop() {
        super.onStop()
        Log.d("MyPoetry", "И случай, бог изобретатель.");
    }

    override fun onDestroy() {
        super.onDestroy()

    }

}