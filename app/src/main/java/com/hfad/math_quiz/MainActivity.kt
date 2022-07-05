package com.hfad.math_quiz

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.VirtualLayout
import com.google.android.material.internal.FlowLayout
import java.util.concurrent.Flow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (resources.configuration.orientation ==
            Configuration.ORIENTATION_PORTRAIT) {


            findViewById<androidx.constraintlayout.helper.widget.Flow>(R.id.flowButtons)
                .setMaxElementsWrap(4)

        }

        if (resources.configuration.orientation ==
                Configuration.ORIENTATION_LANDSCAPE) {

            findViewById<androidx.constraintlayout.helper.widget.Flow>(R.id.flowButtons)
                .setMaxElementsWrap(2)
        }

    }
}