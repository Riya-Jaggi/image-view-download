package com.example.mylibrary

import android.os.AsyncTask
import android.os.Environment
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_gallery_view.*
import java.io.BufferedInputStream
import java.io.File
import java.io.FileOutputStream
import java.net.URL


class DownloadFileFromUri(
    var context: GalleryViewActivity,
    folderName: String
) :
    AsyncTask<String, String, String>() {


    lateinit var outputStream: FileOutputStream
    lateinit var file: File
    var folderName = folderName


    override fun onPreExecute() {
        super.onPreExecute()
        context.progressBar.visibility = View.VISIBLE;
    }
    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)
        context.progressBar.visibility = View.GONE;

        Toast.makeText(context, "Downloaded", Toast.LENGTH_SHORT).show()
    }

    //Download file in background thread
    override fun doInBackground(vararg f_url: String?): String {

        var count: Int

        //download image to internal storage
        try {
            val url = URL(f_url[0])
            val connection = url.openConnection()
            connection.connect()
            //download the file
            var input = BufferedInputStream(url.openStream(), 8192)
            file =
                File(Environment.getExternalStorageDirectory().toString() + File.separator + folderName)
            if (!file.exists()) {
                file.mkdirs()
            }
            val temp = (file.toString() + File.separator + System.currentTimeMillis() + "img.png")

            outputStream = FileOutputStream(temp)

            val data = ByteArray(1024)
            do {
                count = input.read(data)

                // writing data to file
                outputStream.write(data, 0, count)

            } while (count != -1)

            // flushing output
            outputStream.flush()

            // closing streams
            outputStream.close()
            input.close();
        } catch (e: Exception) {
            Log.e("Error: ", e!!.message)
        }
        return ""
    }


}