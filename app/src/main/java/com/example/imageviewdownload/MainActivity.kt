package com.example.imageviewdownload

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.imageviewdownload.R.layout
import com.example.mylibrary.GalleryViewActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
    }

    @Override
    fun onClick(view: View) {
        when (view.id) {
            R.id.botton -> {
                var intent = Intent(this, GalleryViewActivity::class.java)
                intent.putExtra("imageUrl", "https://newevolutiondesigns.com/images/freebies/hd-wallpaper-44.jpg"
                )
                intent.putExtra("folderName","Folder")
                startActivity(intent)
            }
        }
    }
}
