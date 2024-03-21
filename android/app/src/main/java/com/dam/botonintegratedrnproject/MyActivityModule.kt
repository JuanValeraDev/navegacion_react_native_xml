package com.dam.botonintegratedrnproject

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import android.content.Intent

class MyActivityModule(context: ReactApplicationContext) : ReactContextBaseJavaModule(context) {
    private var reactContext: ReactApplicationContext = context

    override fun getName(): String {
        return "MyActivityModule"
    }

    @ReactMethod
    fun navigateToMyActivity() {
        val intent = Intent(reactContext, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        reactContext.startActivity(intent)
    }
}