package ekeitho.com.dagga

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.buttonA)
        val button2 = findViewById<Button>(R.id.buttonB)
        val button3 = findViewById<Button>(R.id.buttonC)
        val intentA = Intent(this, ActivityA::class.java)
        val intentB = Intent(this, ActivityB::class.java)
        val intentC = Intent(this, ActivityC::class.java)


        setViewClickListeners(button1, intentA)
        setViewClickListeners(button2, intentB)
        setViewClickListeners(button3, intentC)

    }

    fun setViewClickListeners(view : View, intent : Intent) {
        view.setOnClickListener { view -> startActivity(intent) }
    }
}
