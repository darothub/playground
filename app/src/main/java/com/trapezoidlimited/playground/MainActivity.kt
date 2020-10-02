package com.trapezoidlimited.playground

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ShareCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            val geo = "geo:0,0?q="
            val loc = "Lagos"
            val linkUrl ="https://www.google.com"
            val url = Uri.parse(linkUrl)
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
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



    }
}