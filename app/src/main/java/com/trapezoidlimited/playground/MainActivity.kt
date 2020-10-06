package com.trapezoidlimited.playground

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.auth0.android.jwt.JWT
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
//            val geo = "geo:0,0?q="
//            val loc = "Lagos"
//            val linkUrl ="https://www.google.com"
//            val url = Uri.parse(linkUrl)
//            val intent = Intent(Intent.ACTION_VIEW, url)
//            startActivity(intent)
            val intent = Intent(Intent.ACTION_MAIN)
            intent.addCategory(Intent.CATEGORY_APP_EMAIL)
            try {
                startActivity(Intent.createChooser(intent, getString(R.string.open_email_app)))
            } catch (e: ActivityNotFoundException) {
                Log.i("Main", "No activity")
            }
//            if(intent.resolveActivity(packageManager) != null){
//
//            }
//            else{
//                Toast.makeText(this, "Cant handle", Toast.LENGTH_LONG).show()
//            }
//            val mimeType = "text/plain"
//            val share = ShareCompat.IntentBuilder
//                    .from(this)
//                    .setType(mimeType)
//                    .setChooserTitle("Share with ")
//                    .setText("What I am sharing")
//                    .startChooser()
        }

//        val token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJwYXlsb2FkIjp7ImVtYWlsIjoiZHVyb3NvbW8uYWJkdWxyYXNhcUBnbWFpbC5jb20iLCJpc1ZlcmlmaWVkIjp0cnVlfSwiaWF0IjoxNjAxNjQ4Nzk2LCJleHAiOjE2MDE3MzUxOTZ9.KrMgA7d6cV2u9vk6vraew1a4LlOesc2J6NPBknfz-uo"
//        val jwt = JWT(token)
//        val istime = jwt.issuedAt?.time
//        val payloadString = jwt.claims.get("payload")?.asObject(Data::class.java)


//        val g = Gson()
//        val str = g.toJson(payloadString)
//        val payload = g.fromJson<Data>(str, Data::class.java)

//        Log.i("Main", "Issuer $payloadString, time$istime")

    }
}