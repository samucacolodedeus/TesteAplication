package com.example.testeaplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCalcular:Button = btnCalcular

        val resultado:TextView = textView5

        btnCalcular.setOnClickListener {
           val nota1:Int = Integer.parseInt(CampoUm.text.toString())
            val nota2:Int = Integer.parseInt(campoDois.text.toString())
            val media = (nota1 + nota2)/2
            val faltas = Integer.parseInt(campoFrequencia.text.toString())

            if(media >= 6 && faltas <= 10){
                resultado.setText("O Aluno foi aprovado!" +  "\n" +
                                  "Média: " + media + "\n" +
                                  "Frequência: " + faltas)
                resultado.setTextColor(Color.GREEN)
            } else{
                resultado.setText("O Aluno foi reprovado!" +  "\n" +
                        "Média: " + media + "\n" +
                        "Frequência: " + faltas)
                resultado.setTextColor(Color.RED)
            }
        }
    }
}
