package com.gothicvanitympc.timecalc

fun hourFinder(hour: Int, pm : Boolean): Int {
    var rHour= hour
    // account for 12am issue being 0 and not 12
   // if (hour == 12 && !pm) rHour = 0
    // use pm bool to convert time entered to 24 hour clock

    if (!pm) {
            when (hour) {
                12 -> rHour = 1
                1 -> rHour = 2
                2 -> rHour = 3
                3 -> rHour = 4
                4 -> rHour = 5
                5 -> rHour = 6
                6 -> rHour = 7
                7 -> rHour = 8
                8 -> rHour = 9
                9 -> rHour = 10
                10 -> rHour = 11
                11 -> rHour = 12
            }
        }
    if (pm){
            when (hour) {
                12 -> rHour = 13
                1 -> rHour = 14
                2 -> rHour = 15
                3 -> rHour = 16
                4 -> rHour = 17
                5 -> rHour = 18
                6 -> rHour = 19
                7 -> rHour = 20
                8 -> rHour = 21
                9 -> rHour = 22
                10 -> rHour = 23
                11 -> rHour = 24

            }
            }
    return rHour
}