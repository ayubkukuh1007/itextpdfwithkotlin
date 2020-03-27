package com.project.itexpdf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_pdfview.*
import java.io.File

class Pdfview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdfview)

        val filePDF = File(this.getExternalFilesDir(null)!!.absolutePath + "/Umroh/PesertaUmroh.pdf")

        pdfView.fromFile(filePDF)
            .enableSwipe(true)
            .swipeHorizontal(true)
            .load()
    }
}
