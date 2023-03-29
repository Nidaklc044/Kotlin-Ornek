package com.nidakilic.lessonone.ntp

import com.nidakilic.lessonone.ntp.composition.Katagoriler
import com.nidakilic.lessonone.ntp.composition.Yonetmenler

data class Filmler(var film_id:Int,
                   var film_ad:String,
                   var film_yil:Int ,
                   var katagori: Katagoriler,
                   var yonetmen: Yonetmenler) {
}