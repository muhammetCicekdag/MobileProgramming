package com.muhammetcicekdag.hafta4

// özellik ve fonksiyonalrın birarada mantıklı hiyerarşık olarak barındırılmasının sağlar



open class User {

    //  var user_name:String?


    // önceden kapsülleyeceiğimiz propertyi mutlaka ama mutlaka
    private var user_name: String = ""
    // yukarıdaki kulanımda isd eğer en başta null alabilecek bir şekilde değişken tanımlamak
    // istiyorsan o zaman tipin yanına ? simgesi koy ki bunu en başta belirt
    fun setUser_Name(USERNAME: String){

        user_name=USERNAME
    }




    var user_name2: String = ""
    var user_surname3: String = ""
    var user_age: Int = 0


    open fun showInfo() {


        println("Name =$user_name ,surname=$user_surname3 , Age = ${user_age.toString()}")

    }




}