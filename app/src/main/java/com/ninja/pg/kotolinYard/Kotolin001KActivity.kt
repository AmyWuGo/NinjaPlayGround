package com.ninja.pg.kotolinYard

import android.view.View
import android.widget.Toast
import com.ninja.pg.screen.TenCasesActivity

class Kotolin001KActivity : TenCasesActivity() {
    override fun onCase001Clicked(view: View?) {
//        Toast.makeText(this@Kotolin001KActivity, "Hello Kotolin", Toast.LENGTH_SHORT).show()
        Toast.makeText(this@Kotolin001KActivity, "HH ${stringList[0]}", Toast.LENGTH_SHORT).show()

    }
}
