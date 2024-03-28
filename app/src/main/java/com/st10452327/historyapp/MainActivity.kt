package com.st10452327.historyapp

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
                    81 -> "Winnie Madikizela-Mandela"
                    44 -> "David Webster"
                    91 -> "Helen Suzman"
                    22 -> "Solomon Mahlangu"
                    30 -> "Steve Biko"
                    92 -> "Albertina Sisulu"
                    69 -> "Lilian Masediba Ngoyi"
                    87 -> "Helen joseph"
                    68 -> "Charlotte Maxeke"
                    78 -> "Mahatma Gandhi"
                    else -> null
                }

            val message = if (Historicalfigure != null) "The Historical figure's name is $Historicalfigure."
                else "No Historical figure found with the entered age."
                resultTextView.text = message


            }else{
                resultTextView.text = "Invalid input. Please enter a valid age between 20 and 10044."
            }


        }

        clearButton.setOnClickListener{
            ageInput.text.clear()
            resultTextView.text = ""

        }
    }
}