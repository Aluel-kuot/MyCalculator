package com.calc.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilMyCalculator: TextInputLayout
    lateinit var tilFirstNumber: TextInputLayout
    lateinit var tilSecondNumber: TextInputLayout
    lateinit var tilResult: TextInputLayout
    lateinit var etMyCalculator: TextInputEditText
    lateinit var etFirstNumber: TextInputEditText
    lateinit var etSecondNumber: TextInputEditText
    lateinit var etResult: TextView
    lateinit var btnAdd: Button
    lateinit var btnsubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnDivide: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()

    }

    override fun onResume() {
        super.onResume()
        btnAdd.setOnClickListener {
            addition()
        }
        btnsubtract.setOnClickListener {
            subtraction()
        }
        btnMultiply.setOnClickListener {
            multiplication()
        }
        btnDivide.setOnClickListener {
            division()
        }

    }

    fun castView() {

        tilMyCalculator = findViewById(R.id.tilMyCalculator)
        tilFirstNumber = findViewById(R.id.tilFirstNumber)
        tilSecondNumber = findViewById(R.id.tilSecondNumber)
        tilResult = findViewById(R.id.tilResult)
        etMyCalculator = findViewById(R.id.etMyCalculator)
        etFirstNumber = findViewById(R.id.etFirstNumber)
        etSecondNumber = findViewById(R.id.etSecondNumber)
        etResult = findViewById(R.id.etResult)
        tilFirstNumber = findViewById(R.id.tilFirstNumber)
        btnAdd = findViewById(R.id.btnAdd)
        btnsubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnDivide = findViewById(R.id.btnDivide)
    }

    fun addition() {
        var firstNumber = etFirstNumber.text.toString().toDouble()
        var secondNumber = etSecondNumber.text.toString().toDouble()
        var result = firstNumber + secondNumber
        etResult.text = result.toString()
    }

    fun subtraction() {
        var firstNumber = etFirstNumber.text.toString().toDouble()
        var secondNumber = etSecondNumber.text.toString().toDouble()
        var result = firstNumber - secondNumber
        etResult.text = result.toString()

    }

    fun multiplication() {
        var firstNumber = etFirstNumber.text.toString().toDouble()
        var secondNumber = etSecondNumber.text.toString().toDouble()
        var result = firstNumber * secondNumber
        etResult.text = result.toString()
    }
    fun division() {
        var firstNumber = etFirstNumber.text.toString().toDouble()
        var secondNumber = etSecondNumber.text.toString().toDouble()
        var result = firstNumber / secondNumber
        etResult.text = result.toString()
    }
}





