package com.example.kotlin.chapter1

fun main(){
    //변경이 가능한 list
    val list= mutableListOf(1,2,3,4,5,)
    list.add(6)
    list[1]=3
    println(list.joinToString(separator = " "))
    val list1= listOf(1,2,3,4,)
//    list1.add
    list1[0]
    println( list1[0])



    val map=mapOf((1 to "안녕"),(2 to "hello"))
    val map1= mutableMapOf((1 to "안녕"),(2 to "hello"))
    map1[3]="응"
    map1[100]="호이"
    //리스트는 다양한 확장자를 쓸수있다 list(1,"엥",1.23 등등)
    //콜렉션같은 경우는 mutable이 있고 immutable이 있는데 mutable은 변형이 가능한 함수입니다.
    println( list1.map{it*10}.joinToString(separator = "/"))
}

