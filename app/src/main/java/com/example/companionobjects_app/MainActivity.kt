package com.example.companionobjects_app

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import androidx.constraintlayout.widget.ConstraintLayout

class Back {

    companion object {
        val night = 0
        val day = 1
    }
       fun changeBackground(layout: View,data:Int){
           when(data){
               0->{layout.setBackgroundColor(Color.BLUE)}
               1->{layout.setBackgroundColor(Color.YELLOW)}
           }
       }

}

class MainActivity : AppCompatActivity() {

   private lateinit var clMain:ConstraintLayout
    private lateinit var ed:EditText
    private lateinit var imBtn:ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clMain=findViewById(R.id.clMain)
        ed=findViewById(R.id.edMain)
        imBtn=findViewById(R.id.imBtn)

        imBtn.setOnClickListener (object : View.OnClickListener {
            override fun onClick(p0:View?){

               var edValue= ed.text?.toString()

                when(edValue?.toLowerCase()){
                    "day"->{
                        val b = Back()
                        b.changeBackground(clMain,Back.day)
                    }
                    "night"->{
                        val b = Back()
                        b.changeBackground(clMain,Back.night)
                    }
                }
            }


        })
    }
}