package com.example.sandbox

import android.opengl.GLSurfaceView
import androidx.fragment.app.FragmentActivity

class MyGLSurfaceView(context: FragmentActivity?) : GLSurfaceView(context) {

    private val renderer: MyGLRenderer

    init {

        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2)

        renderer = MyGLRenderer()

        // Set the Renderer for drawing on the GLSurfaceView
        setRenderer(renderer)
    }
}