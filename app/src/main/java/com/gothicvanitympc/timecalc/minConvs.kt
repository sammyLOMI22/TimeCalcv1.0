package com.gothicvanitympc.timecalc

import kotlin.math.absoluteValue
// function to find time by converting both times to minutes from midnight to get time elapsed
fun minConvs(sHour: Int ,sMin :Int , Spm : Boolean, fHour: Int, fMin : Int, fPm : Boolean): String {

    val mnd= 1440
    val mnh = 60

    // todo new algrithom to solve issue using minutes
    var sMinT=(sHour * mnh)+ sMin
    var fMinT =(fHour * mnh)+ fMin
    var tTm = fMinT-sMinT
    if(tTm < 0){
        tTm= tTm + mnd
    }
    var cH =tTm.absoluteValue/mnh

    var cM = fMin-sMin

    var result = "Hours: "+ cH.absoluteValue + " Minutes: "+ cM.absoluteValue

    return result
}