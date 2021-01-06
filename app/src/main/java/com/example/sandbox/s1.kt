package com.example.sandbox

import android.opengl.GLSurfaceView
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class s1 : Fragment(R.layout.fragment_s1) {
    private lateinit var gLView: GLSurfaceView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        gLView = MyGLSurfaceView(this.activity)
        //setContentView(gLView)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_s1, container, false)
        gLView = MyGLSurfaceView(this.activity)
        return gLView
    }
}