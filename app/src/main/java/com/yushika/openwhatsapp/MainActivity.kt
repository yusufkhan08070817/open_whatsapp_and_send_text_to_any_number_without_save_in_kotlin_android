package com.yushika.openwhatsapp

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  setContentView(R.layout.activity_main)
        val phonenumber:String="91XXXXXXXXXX"

    tc {     val sendIntent = Intent("android.intent.action.MAIN")
        sendIntent.component = ComponentName("com.whatsapp", "com.whatsapp.Conversation")
        sendIntent.putExtra("jid", "$phonenumber@s.whatsapp.net")

        startActivity(sendIntent) }
    }
    fun tc(function:()->Unit)
    {
        try {
           function()
        }catch (E:Exception)
        {
            t(E)
        }
    }
    fun t(text:Any){
        Toast.makeText(this, "$text", Toast.LENGTH_SHORT).show()
    }
}
