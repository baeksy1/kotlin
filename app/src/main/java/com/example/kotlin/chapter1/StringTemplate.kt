package com.example.kotlin.chapter1

fun main(){
 val a=10
    val name="안녕"
    val isHigh=true
    println(a.toString()+name+isHigh.toString())
    String.format("%s %d",name,a)//한번에 연결해서 써야되고 정확한 타입을 지켜야 되어서 귀찮은 일이 빈번했음

    //"$"를 쓰면 값이 바로 나옴 !!타입이 어떻든 다 보인다. 변수에 있는 함수는 {}를 붙이면 식에 대한 값이 나옴
    println("$a ${name.length} $isHigh")

}
