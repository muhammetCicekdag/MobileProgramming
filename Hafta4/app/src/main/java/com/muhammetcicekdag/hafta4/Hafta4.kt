package com.muhammetcicekdag.hafta4

private var NEWSTUDENT.student_no: Int

fun main(){





var user_1 =User()


user_1.setUser_Name("Muhammet")

user_1.user_surname3="ATLAN"
user_1.user_age=32

user_1.showInfo()
println("**********************************************")
println("user name = ${user_1.setUser_Name("Muhammet")}")
    println("**********************************************")



var islem =math()

islem.sayi_1 = 2
islem.sayi_2 = 1
islem.toplama()
islem.cikarma()
islem.carpma()
islem.bolum()


println("***********************************************")

var student_1 =student()

student_1.setUser_Name("Muhammet")
    student_1.user_surname3="CICEKDAG"
    student_1.user_age=22
    student_1.student_no=123456
 student_1.vize=85
 student_1.final_not=97
 student_1.not()
    println("***********************************************")
student_1.student_no=554555454
 student_1.showInfo()
 user_1.showInfo()

    println("***********************************************")
















// abstrack klaslarla istance türetilmezler

var my_new_student =NEWSTUDENT()

my_new_student.setAllProperties("muhammet","cicekdag",32)
my_new_student.student_no=123456
my_new_student.newshowInfo()
my_new_student.belong_class()




}