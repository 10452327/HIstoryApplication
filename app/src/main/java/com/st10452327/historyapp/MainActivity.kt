package com.st10452327.historyapp
//ST10452327 Siphesihle Siphamandla Bandile Nkabinde

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
   // declare variables
    private lateinit var GenerateHistoryButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var ageInput: EditText
    private lateinit var clearButton: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize
        GenerateHistoryButton= findViewById(R.id.GenerateHistoryButton)
        clearButton= findViewById(R.id.clearbutton)
        ageInput= findViewById(R.id.ageInput)
        resultTextView= findViewById(R.id.resultTextView)


        GenerateHistoryButton.setOnClickListener{
            // create a variable of age to get value from user
            val age = ageInput.text.toString().toIntOrNull()

            // if age is not full and  age is in range between 20 and 50
            if (age != null && age in 20..100){
                // when age is 30 display Thato else when is .. and so on
                val Historicalfigure = when(age){
                    81 -> "Winnie Madikizela-Mandela. You are 81 years  old, which is the same age as Winnie Madikizela-Mandela."
                    44 -> "David Webster. You are 44 years old, which is the same age as David Webster."
                    91 -> "Helen Suzman. You are 91 years old, which is the same age as Helen Suzman."
                    22 -> "Solomon Mahlangu. You are 22 years old, which is the same age as Solomon Mahlangu."
                    30 -> "Steve Biko. You are 30 years old, which is the same age as Steve Biko."
                    92 -> "Albertina Sisulu. You are 92 years old, which is the same age as Albertina Sisulu."
                    69 -> "Lilian Masediba Ngoyi. You are 69 years old, which is the same age as Lilian Masediba Ngoyi."
                    87 -> "Helen Joseph. You are 87 years old, which is the same age as Helen Joseph."
                    68 -> "Charlotte Maxeke. You are 68 years old, which is the same age as Charlotte Maxeke."
                    78 -> "Mahatma Gandhi. You are 78 years old, which is the same age as Mahatma Gandhi"
                    else -> null
                }

            val message = if (Historicalfigure != null) "The Historical figure's name was $Historicalfigure."
                else "No Historical figure found with the entered age."
                resultTextView.text = message


            }else{
                resultTextView.text = "Invalid input. Please enter a valid age between 20 and 100."
            }


        }

        clearButton.setOnClickListener{
            ageInput.text.clear()
            resultTextView.text = ""

        }
    }
}