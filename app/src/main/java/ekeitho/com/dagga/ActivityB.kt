package ekeitho.com.dagga

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import ekeitho.com.dagga.di.ModuleB
import ekeitho.com.dagga.pojo.Galaxy
import javax.inject.Inject

class ActivityB : AppCompatActivity() {

    @Inject lateinit var galaxy : Galaxy

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        (application as MyApplication).component.plusB(ModuleB()).inject(this)

        val text = "This galaxy has ${galaxy.stars} stars."
        val tv = findViewById<TextView>(R.id.tv_galaxy)
        tv.text = text
    }
}