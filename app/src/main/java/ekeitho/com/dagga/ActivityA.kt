package ekeitho.com.dagga

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import ekeitho.com.dagga.di.ModuleA
import ekeitho.com.dagga.pojo.Animal
import javax.inject.Inject


class ActivityA : AppCompatActivity() {

    @Inject lateinit var animal : Animal

    // awesome way to use extension property
    val Activity.app : MyApplication
        get() = application as MyApplication

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)


        app.component.plusA(ModuleA()).inject(this)

        val text = animal.name + " the " + animal.breed
        val tv = findViewById<TextView>(R.id.tv_animal)
        tv.text = text
    }
}

