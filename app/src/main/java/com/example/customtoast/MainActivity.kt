package com.example.customtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showToast(v: View)      //  v is used when we want many button to function
    {
        val view = layoutInflater.inflate(R.layout.custom_toast, null)
        val myToast = Toast(this)
        myToast.duration = Toast.LENGTH_SHORT
        myToast.setGravity(Gravity.BOTTOM, 0, 50)
        myToast.view = view
        myToast.show()
    }
}
