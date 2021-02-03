package edu.coe.richmond.testing10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Button
import android.widget.Switch
import java.util.*



class MainActivity : AppCompatActivity() {
//Language/Concept App
    val langList = arrayListOf("C++", "Java", "Python", "JavaScript", "Kotlin")
    val conceptList = arrayListOf("Loops", "Variables", "Syntax", "Conditional Statements", "Input/Output")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val langText: TextView = findViewById(R.id.langText)
        val button: Button = findViewById(R.id.button)
        val switch1: Switch = findViewById(R.id.switch1)
        val conceptText: TextView = findViewById(R.id.conceptText)
        button.setOnClickListener {
            val random = Random()
            val randomLang = random.nextInt(langList.count())
            langText.text = langList[randomLang]
            if (switch1.isChecked) {
                val randomConcept = random.nextInt(conceptList.count())
                conceptText.text = conceptList[randomConcept]
            }
        }
        fun test(v: View) {

        }
    }
}