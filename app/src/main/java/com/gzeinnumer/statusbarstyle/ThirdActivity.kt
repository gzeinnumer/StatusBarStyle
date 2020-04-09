package com.gzeinnumer.statusbarstyle

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_main.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)
            window.statusBarColor = ResourcesCompat.getColor(resources, android.R.color.transparent, null);
        }

        btn.setOnClickListener {
            startActivity(Intent(applicationContext, FourthActivity::class.java))
        }
    }

}
