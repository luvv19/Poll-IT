package com.example.work

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView

class Last_activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last)
        var text1=findViewById<TextView>(R.id.textView5)
        var text2=findViewById<TextView>(R.id.textView6)
        var text3=findViewById<TextView>(R.id.textView7)
        var text4=findViewById<TextView>(R.id.textView8)
        var text5=findViewById<TextView>(R.id.textView9)
        var text6=findViewById<TextView>(R.id.textView13)
        var text7=findViewById<TextView>(R.id.textView14)
        var text8=findViewById<TextView>(R.id.textView15)
        var text9=findViewById<TextView>(R.id.textView16)
        var text10=findViewById<TextView>(R.id.textView17)
        var switch1=findViewById<Switch>(R.id.switch1)
        var switch2=findViewById<Switch>(R.id.switch2)
        var switch3=findViewById<Switch>(R.id.switch3)
        var switch4=findViewById<Switch>(R.id.switch4)
        var switch5=findViewById<Switch>(R.id.switch5)
        var button=findViewById<Button>(R.id.button)
        val name1= arrayOfNulls<String>(5)
        val name2= arrayOfNulls<String>(5)
        val choices= arrayOfNulls<String>(5)

        var get=intent.getIntExtra("Yoo",0)
        if(get==1) {
            var Area1 = resources.getStringArray(R.array.Area1)
            var i = 0

            for (area in Area1) {
                var part = area.split(",")
                name1[i] = part[0].trim()
                name2[i] = part[1].trim()
                i += 1
            }
            text1.text = name1[0]
            text3.text = name1[1]
            text5.text = name1[2]
            text7.text = name1[3]
            text9.text = name1[4]

            text2.text = name2[0]
            text4.text = name2[1]
            text6.text = name2[2]
            text8.text = name2[3]
            text10.text = name2[4]

            if (switch1.isChecked)
                choices[0] = text1.toString()
            else
                choices[0] = text2.toString()
            if (switch2.isChecked)
                choices[1] = text3.toString()
            else
                choices[1] = text4.toString()
            if (switch3.isChecked)
                choices[2] = text5.toString()
            else
                choices[2] = text6.toString()
            if (switch4.isChecked)
                choices[3] = text7.toString()
            else
                choices[3] = text8.toString()
            if (switch5.isChecked)
                choices[4] = text9.toString()
            else
                choices[4] = text10.toString()

        }

            else if(get==2) {
            var Area2 = resources.getStringArray(R.array.Area1)
            var i = 0

            for (area in Area2) {
                var part = area.split(",")
                name1[i] = part[0].trim()
                name2[i] = part[1].trim()
                i += 1
            }
            text1.text = name1[0]
            text3.text = name1[1]
            text5.text = name1[2]
            text7.text = name1[3]
            text9.text = name1[4]

            text2.text = name2[0]
            text4.text = name2[1]
            text6.text = name2[2]
            text8.text = name2[3]
            text10.text = name2[4]

            if (switch1.isChecked)
                choices[0] = text1.toString()
            else
                choices[0] = text2.toString()
            if (switch2.isChecked)
                choices[1] = text3.toString()
            else
                choices[1] = text4.toString()
            if (switch3.isChecked)
                choices[2] = text5.toString()
            else
                choices[2] = text6.toString()
            if (switch4.isChecked)
                choices[3] = text7.toString()
            else
                choices[3] = text8.toString()
            if (switch5.isChecked)
                choices[4] = text9.toString()
            else
                choices[4] = text10.toString()
        }

                else if(get==3) {
            var Area3 = resources.getStringArray(R.array.Area1)
            var i = 0

            for (area in Area3) {
                var part = area.split(",")
                name1[i] = part[0].trim()
                name2[i] = part[1].trim()
                i += 1
            }
            text1.text = name1[0]
            text3.text = name1[1]
            text5.text = name1[2]
            text7.text = name1[3]
            text9.text = name1[4]

            text2.text = name2[0]
            text4.text = name2[1]
            text6.text = name2[2]
            text8.text = name2[3]
            text10.text = name2[4]

            if (switch1.isChecked)
                choices[0] = text1.toString()
            else
                choices[0] = text2.toString()
            if (switch2.isChecked)
                choices[1] = text3.toString()
            else
                choices[1] = text4.toString()
            if (switch3.isChecked)
                choices[2] = text5.toString()
            else
                choices[2] = text6.toString()
            if (switch4.isChecked)
                choices[3] = text7.toString()
            else
                choices[3] = text8.toString()
            if (switch5.isChecked)
                choices[4] = text9.toString()
            else
                choices[4] = text10.toString()
        }

                    else if(get==4) {
            var Area4 = resources.getStringArray(R.array.Area1)
            var i = 0

            for (area in Area4) {
                var part = area.split(",")
                name1[i] = part[0].trim()
                name2[i] = part[1].trim()
                i += 1
            }
            text1.text = name1[0]
            text3.text = name1[1]
            text5.text = name1[2]
            text7.text = name1[3]
            text9.text = name1[4]

            text2.text = name2[0]
            text4.text = name2[1]
            text6.text = name2[2]
            text8.text = name2[3]
            text10.text = name2[4]

            if (switch1.isChecked)
                choices[0] = text1.toString()
            else
                choices[0] = text2.toString()
            if (switch2.isChecked)
                choices[1] = text3.toString()
            else
                choices[1] = text4.toString()
            if (switch3.isChecked)
                choices[2] = text5.toString()
            else
                choices[2] = text6.toString()
            if (switch4.isChecked)
                choices[3] = text7.toString()
            else
                choices[3] = text8.toString()
            if (switch5.isChecked)
                choices[4] = text9.toString()
            else
                choices[4] = text10.toString()
        }

                        else if(get==5) {
            var Area5 = resources.getStringArray(R.array.Area1)
            var i = 0

            for (area in Area5) {
                var part = area.split(",")
                name1[i] = part[0].trim()
                name2[i] = part[1].trim()
                i += 1
            }
            text1.text = name1[0]
            text3.text = name1[1]
            text5.text = name1[2]
            text7.text = name1[3]
            text9.text = name1[4]

            text2.text = name2[0]
            text4.text = name2[1]
            text6.text = name2[2]
            text8.text = name2[3]
            text10.text = name2[4]

            if (switch1.isChecked)
                choices[0] = text1.toString()
            else
                choices[0] = text2.toString()
            if (switch2.isChecked)
                choices[1] = text3.toString()
            else
                choices[1] = text4.toString()
            if (switch3.isChecked)
                choices[2] = text5.toString()
            else
                choices[2] = text6.toString()
            if (switch4.isChecked)
                choices[3] = text7.toString()
            else
                choices[3] = text8.toString()
            if (switch5.isChecked)
                choices[4] = text9.toString()
            else
                choices[4] = text10.toString()
        }
        var intent=Intent(this,VIew::class.java)
        intent.putExtra("Choice",choices)
        startActivity(intent)



        }
    }
