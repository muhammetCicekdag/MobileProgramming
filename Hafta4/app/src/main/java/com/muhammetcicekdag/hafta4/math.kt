package com.muhammetcicekdag.hafta4

class math {

    var sayi_1:Int=0
    var sayi_2:Int=0

    fun toplama (){

        var sonuc=sayi_1+sayi_2
        println("toplam =${sonuc.toString()}")

    }

    fun cikarma (){

        var sonuc=sayi_1-sayi_2
        println("farklari =${sonuc.toString()}")

    }
    fun carpma (){

        var sonuc=sayi_1 * sayi_2
        println("carpim =${sonuc.toString()}")

    }
    fun bolum (){

        var sonuc=sayi_1.toDouble() / sayi_2.toDouble()
        println("bolum =${sonuc.toString()}")

    }

}