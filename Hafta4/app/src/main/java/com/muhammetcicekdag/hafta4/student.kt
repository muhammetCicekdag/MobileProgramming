package com.muhammetcicekdag.hafta4

class student: User() {

    var student_no:Int=0
    var lessons = mutableListOf<String>()
    var vize =0
    var final_not =0


    // vizenin yüzde 40 ı ile finalın yüzde 60 ını heaplayıp ekrana yazdırn kodu yaz

    fun not (){

        var sonuc=((vize*0.40)+(final_not*0.60))
        println("ortalama =${sonuc.toString()}")

    }

    override fun showInfo() {

        println("name =${setUser_Name("muhammet")}user_name ,surname=$user_surname3 , Age = ${user_age.toString()} , student no = ${student_no.toString()}")


    }








}
