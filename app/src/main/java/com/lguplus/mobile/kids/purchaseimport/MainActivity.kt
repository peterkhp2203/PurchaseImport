package com.lguplus.mobile.kids.purchaseimport

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.lguplus.mobile.kids.purchase.Dummy

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToast()
    }

    private fun showToast() {
        val message = Dummy().message
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}