package com.example.kotlin.chapter2

fun main(){
    //확장함수 extention function
    //기존에 정의되어 있는 클래스에 함수를 추가하는 기능

    Test().hello()
    Test().hi()
}

fun Test.hi()= print("하이") //함수로 확장해서 쓸수있음 커스텀을 위해 상속을 안받아도 됨

class Test(){
    fun hello()= println("안녕")
    fun bye()= println("잘가")
}