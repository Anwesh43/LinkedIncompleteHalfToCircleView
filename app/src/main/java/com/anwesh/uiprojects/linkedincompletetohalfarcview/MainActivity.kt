package com.anwesh.uiprojects.linkedincompletetohalfarcview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.incompletetohalfarcview.IncompleteToHalfArcView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        IncompleteToHalfArcView.create(this)
    }
}
