package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.jar.Pack200

class calculator : AppCompatActivity() {
    lateinit var btnAdd:Button
    lateinit var btnMultiply:Button
    lateinit var btnDivide:Button
    lateinit var btnMinus:Button
    lateinit var etNum1:EditText
    lateinit var etNum2:EditText
    lateinit var tvAnswer:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        btnAdd=findViewById(R.id.btnAdd)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnDivide=findViewById(R.id.btnDivide)
        btnMinus=findViewById(R.id.btnMinus)
        etNum1=findViewById(R.id.etNum1)
        etNum2=findViewById(R.id.etNum2)
        tvAnswer=findViewById(R.id.tvAnswer)


        btnAdd.setOnClickListener {
            tvAnswer.text=""

            val number1 =etNum1.text.toString().toDouble()
            val number2 =etNum2.text.toString().toDouble()
            addition(number1,number2)
        }
        btnMultiply.setOnClickListener {
            tvAnswer.text=""
            val number3 =etNum1.text.toString().toDouble()
            val number4 =etNum2.text.toString().toDouble()
            multiply(number3,number4)
        }
        btnDivide.setOnClickListener {
            tvAnswer.text=""

            val number5 =etNum1.text.toString().toDouble()
            val number6 =etNum2.text.toString().toDouble()
            modulus(number5,number6)
        }
        btnMinus.setOnClickListener {
            tvAnswer.text=""

            val number7 =etNum1.text.toString().toDouble()
            val number8 =etNum2.text.toString().toDouble()
            minus(number7,number8)
        }


    }

     fun minus(number7: Double, number8: Double) {
            var minus=number7-number8
               tvAnswer.text.toString()
    }

    fun modulus(number5: Double, number6: Double) {
        var divide = number5%number6
        tvAnswer.text.toString()

    }

    fun multiply(number3: Double, number4: Double) {
           var multiply=number3*number4
             tvAnswer.text.toString()
    }

    fun addition(number1: Double, number2: Double) {
         var add=number1+number2
        tvAnswer.text=add.toString()
    }
}