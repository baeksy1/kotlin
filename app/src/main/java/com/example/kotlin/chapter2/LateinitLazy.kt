package com.example.kotlin.chapter2

//호출할때마다 ?를 붙여야 되기 때문에 귀찮음이 있음
//var text:String?=null
//바로 값을 안줘도 됨 대신 타입을 줘야됨
lateinit var text:String
//lateinit var age:Int //프리미티브 타입은 안됨
lateinit var age:Integer


//호출하는 시점에서 초기화됨 그러기에 한번 실행된다. 메모리에 효율적임
val test:Int by lazy {

    println("초기화중")
    100
}

fun main(){
    text="name"
    println( text)
    println("초기화 한 값 $test")
    println("두번째 값 $test")


}