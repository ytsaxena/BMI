package android.pass.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //BMI body masss Index  ( weight : height )
        // bmi = w /(h*h)  -> kg/m2

        btnCalculate.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

                    if(edtWeight.text.toString()!="" && edtHeightfeet.text.toString()!="" && edtHeightInches.text.toString()!=""){

                    val weight = edtWeight.text.toString().toInt()


                    val heightFt = edtHeightfeet.text.toString().toInt()
                    val heightInch = edtHeightInches.text.toString().toInt()

                    val totalHeightInch = heightFt * 12 + heightInch

                    val heightincm = totalHeightInch * 2.54
                    val heightMeter = heightincm / 100

                    val bmi = weight / (heightMeter * heightMeter)
                        
                        val roundoff :Double = String.format("%.3f", bmi).toDouble()
                    when {

                        bmi > 25 -> {
                            txtBmi.text = "You are Fattty ${roundoff.toString()}"
                        }

                        bmi < 18 -> {
                            txtBmi.text = "You are Skinny ${roundoff.toString()}"
                        }

                        else -> {
                            txtBmi.text = "You are Fit ${roundoff.toString()}"
                        }
                    }

                    }
                else {
                    Toast.makeText(applicationContext, "Please Fill Your Height & Weight", Toast.LENGTH_SHORT).show()
              }

            }


        })

    }

}
