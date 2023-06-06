package com.aapexo.webviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webviewVar = findViewById<WebView>(R.id.webview1)
        webViewSetup(webviewVar)
    }
    private fun webViewSetup(webView: WebView){
        webView.webViewClient = WebViewClient()
        webView.apply {
            settings.safeBrowsingEnabled = true
            settings.javaScriptEnabled = true
            loadUrl("https://aapexo.com/")
        }
    }

}