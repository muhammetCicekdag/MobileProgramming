package com.muhammetcicekdag.hafta4

abstract class NewUser {

    protected var user_name: String = ""
    protected var user_surname: String = ""
    protected var user_age: Int = 0

    abstract fun showInfo()


fun setAllProperties(name: String, surname: String, age: Int) {

    user_name =newName
    user_surname=newSurname
    user_age=newAge

 }


// abstract methotlar sadece tanımlanır, içi doldurulamaz
    //fonksiyon ne amaçla kullanılacağı hangi işlemleri
    //yapacapı hangi çıktıları vereceği    !!!!!! TANIMLANMAZ!!!!!!W

abstract fun newshowInfo()
    open fun belong_class(){

        print("Bu metot, abstract klasa ait normal bir mettottur")
    }


}