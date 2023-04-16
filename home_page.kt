package com.example.work

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Switch
import android.widget.TextView
import com.google.android.material.chip.Chip

class Home_page : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val election_1 = findViewById<Button>(R.id.election_1)
        val election_2 = findViewById<Button>(R.id.election_2)
        val election_3 = findViewById<Button>(R.id.election_3)
        val election_4 = findViewById<Button>(R.id.election_4)
        val election_5 = findViewById<Button>(R.id.election_5)
        val xyz = findViewById<RadioButton>(R.id.radioButton)
        val abc = findViewById<RadioButton>(R.id.radioButton2)

        xyz.setOnCheckedChangeListener { buttonView, isChecked ->
            if (xyz.isChecked) {
                xyz.visibility = View.INVISIBLE
                election_3.visibility = View.VISIBLE
                election_4.visibility = View.VISIBLE
                election_5.visibility = View.VISIBLE
                abc.visibility = View.VISIBLE
            }
        }
        abc.setOnCheckedChangeListener { buttonView, isChecked ->
            if (abc.isChecked) {
                xyz.visibility = View.VISIBLE
                election_3.visibility = View.INVISIBLE
                election_4.visibility = View.INVISIBLE
                election_5.visibility = View.INVISIBLE
                abc.visibility = View.INVISIBLE
            }

            election_1.setOnClickListener {
                var intent = Intent(this, Last_activity::class.java)
                startActivity(intent)
                intent.putExtra("Yoo", 1)
            }
            election_2.setOnClickListener {
                var intent = Intent(this, Last_activity::class.java)
                startActivity(intent)
                intent.putExtra("Yoo", 2)
            }
            election_3.setOnClickListener {
                var intent = Intent(this, Last_activity::class.java)
                startActivity(intent)
                intent.putExtra("Yoo", 3)
            }
            election_4.setOnClickListener {
                var intent = Intent(this, Last_activity::class.java)
                startActivity(intent)
                intent.putExtra("Yoo", 4)
            }
            election_5.setOnClickListener {
                var intent = Intent(this, Last_activity::class.java)
                startActivity(intent)
                intent.putExtra("Yoo", 5)
            }


        }
    }
}
