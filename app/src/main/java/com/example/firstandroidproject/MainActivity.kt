package com.example.firstandroidproject

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.firstandroidproject.theme.AndroidLibraryTheme
import com.example.mylibrary_demo_lib.MessageClas
import com.plcoding.image_preview.ImagePreview

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


         setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
             val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }





        findViewById<Button>(R.id.toast_button)
            .setOnClickListener {
                Toast.makeText(this, "Toast Button Clicked!!", Toast.LENGTH_SHORT).show()
                Log.d("BUTTONS", "User tapped the Toast Button")
            }

        findViewById<Button>(R.id.random_button)
            .setOnClickListener {
                Log.d("BUTTONS", "User tapped the Random Button")


            }

        findViewById<Button>(R.id.count_buton)
                .setOnClickListener {
                    val showCountTextView = findViewById<TextView>(R.id.textview_third)
                    val countString = showCountTextView.text.toString()
                    var count = countString.toInt()
                    count++
                    showCountTextView.text = count.toString()
            }
        //Call External Module
        MessageClas.showMSDMessage(this, "Hello Mahendra Welcome to Chaster IT Soluions.!!")
    }





    fun increaseCounter(view:View){
        val showCountTextView = view.findViewById<TextView>(R.id.textview_third)
        val countString = showCountTextView.text.toString()
        var count = countString.toInt()
        showCountTextView.text = count.toString()
    }

}