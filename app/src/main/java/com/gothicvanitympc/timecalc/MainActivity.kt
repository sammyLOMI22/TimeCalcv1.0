package com.gothicvanitympc.timecalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.absoluteValue
import kotlin.text.*
import kotlin.time.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calcBtn.setOnClickListener { timeCalc() }
    }
// todo add a check to catch null input values maybe hide elapse time until after time is displayed
    private fun timeCalc() {
        //get text input
        //validate input to make sure only valid numbers 1-24 and 00 - 59 can be input
        var startTimeNB = startTime.text.toString()
        var finishTimeNB = FinshTimeT.text.toString()
         var sPm = startSW.isChecked
         var fPm = finishSW.isChecked

        //turn in to time by spliting numbers
        var sHour = startTimeNB.split(":")
        var startH = sHour[0]
        var startM =sHour[1]

        var fHour = finishTimeNB.split(":")
        var fH = fHour[0]
        var fM =fHour[1]

        //calculation algorithm
        var tH =0
        var tM =0;
        var stH=0;
        var fnH =0;
        // validate hour data
        if(fH.toInt() in 1..24  && startH.toInt() in 1..24 ){
            // translate to 24 hour format
            stH =hourFinder(startH.toInt(), sPm)
            fnH = hourFinder(fH.toInt(), fPm)
        }
        else{
            ElapT.text = "Not a valid hour value! Enter a number between 1-24:XX"
        }
        // validate minute data
        if(startM.toInt() in 0..59 && fM.toInt() in 0..59) {
           // tM = startM.toInt() - fM.toInt()
        }
        else{
            ElapT.text = "Not a valid minute value! Enter a number between X:00-59"
        }
        //calculation
        var totalT = minConvs(stH,startM.toInt(), sPm, fnH, fM.toInt(), fPm)
        // display in label
        ElapT.text = totalT
    }
}