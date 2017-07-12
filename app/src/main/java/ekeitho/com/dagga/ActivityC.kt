package ekeitho.com.dagga

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import ekeitho.com.dagga.di.ModuleC
import ekeitho.com.dagga.pojo.Person
import javax.inject.Inject

class ActivityC : AppCompatActivity() {

    @Inject lateinit var person : Person

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        (application as MyApplication).component.plusC(ModuleC()).inject(this)

        val text = "My name is ${person.name} and I am ${person.age} years old."
        val tv = findViewById<TextView>(R.id.tv_person)
        tv.text = text
    }
}