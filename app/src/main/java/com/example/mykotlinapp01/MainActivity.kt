package com.example.mykotlinapp01

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var btnAdd: Button;
    lateinit var btnSub: Button;
    lateinit var btnMul: Button;
    lateinit var btnDiv: Button;
    lateinit var etA: EditText;
    lateinit var etB: EditText;
    lateinit var resultTv: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnAdd = findViewById(R.id.btn_add)
        btnAdd.setOnClickListener { onClick(it) }
        btnSub = findViewById(R.id.btn_sub)
        btnSub.setOnClickListener { onClick(it) }
        btnMul = findViewById(R.id.btn_mul)
        btnMul.setOnClickListener { onClick(it) }
        btnDiv = findViewById(R.id.btn_div)
        btnDiv.setOnClickListener { onClick(it) }

        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        resultTv = findViewById(R.id.result_tv)
    }

    fun onClick(p0: View?) {
        val a = etA.text.toString().toInt()
        val b = etB.text.toString().toInt()
        when (p0?.id) {
            R.id.btn_add -> {
                resultTv.text = (a + b).toString()
            }

            R.id.btn_sub -> {
                resultTv.text = (a - b).toString()
            }

            R.id.btn_mul -> {
                resultTv.text = (a * b).toString()
            }

            R.id.btn_div -> {
                resultTv.text = (a / b).toString()
            }
        }
    }
}