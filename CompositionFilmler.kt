package com.nidakilic.lessonone.ntp

import com.nidakilic.lessonone.ntp.composition.Katagoriler
import com.nidakilic.lessonone.ntp.composition.Yonetmenler

fun main(){
    val k1=Katagoriler(1,"dram")
    val k2=Katagoriler(2,"komedi")

    val y1=Yonetmenler(1,"Nuri Bilge Ceylan")
    val y2=Yonetmenler(2,"Quentin Tarantino")

    val f1=Filmler(1,"Django",2013,k1,y2)

    println("film adi: ${f1.film_ad}")
    println("film id:${f1.film_id}")
    println("film yılı:${f1.film_yil}")
    println("katagori:${f1.katagori}")
    println("yönetmen:${f1.yonetmen}")




}