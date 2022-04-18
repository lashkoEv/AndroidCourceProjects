package com.dnu.android.lr2android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_view.view.*

class MainActivity : AppCompatActivity(), BaseDialog.Listener {

    private val viewModel = CustomViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.getText()

        viewModel.liveData.observe(this) {

            cvNote1.setOnclickListener { BaseDialog.newInstance(it.title, supportFragmentManager) }
            cvNote2.setOnclickListener { BaseDialog.newInstance(it.title, supportFragmentManager) }
            cvNote3.setOnclickListener { BaseDialog.newInstance(it.title, supportFragmentManager) }
            cvNote4.setOnclickListener { BaseDialog.newInstance(it.title, supportFragmentManager) }

        }
    }

    override fun onClick(){
        Toast.makeText(this, "OK", Toast.LENGTH_LONG).show()
    }
}