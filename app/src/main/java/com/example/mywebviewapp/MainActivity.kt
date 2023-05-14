package com.example.mywebviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //Webview Code

        val myWeb = findViewById<WebView>(R.id.webview)

        myWeb.apply {
            loadUrl("https://www.google.com")


        }



    }
}