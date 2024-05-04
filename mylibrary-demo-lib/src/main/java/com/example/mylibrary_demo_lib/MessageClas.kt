package com.example.mylibrary_demo_lib

import android.content.Context
import android.util.Log
import android.widget.Toast

class MessageClas {
    companion object {
        fun showMSDMessage(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()

        }
    }
}