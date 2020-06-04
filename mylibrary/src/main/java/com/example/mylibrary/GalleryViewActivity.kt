package com.example.mylibrary

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import kotlinx.android.synthetic.main.activity_gallery_view.*

class GalleryViewActivity : AppCompatActivity() {

    var image : String = ""
    var folderName : String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery_view)

        var intenntData = intent.extras
        image = intenntData!!.getString("imageUrl")!!
        folderName = intenntData!!.getString("folderName")!!

        Glide.with(this)
            .load(image)
            .listener(object:RequestListener<Drawable> {
                override fun onLoadFailed(
                    e: GlideException?,
                    model: Any?,
                    target: Target<Drawable>?,
                    isFirstResource: Boolean
                ): Boolean {
                    progressBar.visibility = View.GONE;
                    return false;
                }

                override fun onResourceReady(
                    resource: Drawable?,
                    model: Any?,
                    target: Target<Drawable>?,
                    dataSource: DataSource?,
                    isFirstResource: Boolean
                ): Boolean {
                    progressBar.visibility = View.GONE;
                    return false;
                }

            })
            .into(imageDisplay)
    }

    @Override
    fun onClick(view: View){
        when(view.id){
            R.id.cross_btn->{
                onBackPressed()
            }
            R.id.download_btn->{

                download(image)
            }
        }
    }

    private fun download(image: String) {

        DownloadFileFromUri(this,folderName).execute(image)
    }
}
