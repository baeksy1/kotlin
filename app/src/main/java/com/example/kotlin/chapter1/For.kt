package com.example.kotlin.chapter1

fun main(){
//   for (int i =1,i<11; i++){
//
//    }
//    1..10==IntRange(1,10) 둘이 같은 의미
    for(i in 1..10){
        print(i)
        print(".")
    }
    //until은 끝에 숫자를 포함하지 않는다는 의미
    for(i in 1 until 10) {
    print(i)

    }


    for(i in 10 downTo 1){

    }
    println()
    //while문
    var c=1
    while(c<11){
        print(c)
        c++
    }
}

