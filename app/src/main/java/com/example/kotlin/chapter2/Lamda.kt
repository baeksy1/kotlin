package com.example.kotlin.chapter2

//람다식

fun main(){
    //1, 람다식은 익명함수이다. 즉 이름이 없다는 뜻
    //2. 하나의 변수처럼 사용이 가능하다. 함수의 argument or return이 될수있다.
    //3. 한번 사용되고, 재사용되지 않는 함수
    val a =fun(){ println("hello") } //진짜 이름이 없어!
    val b:Int=10
    val c:(Int)->Int={it*10}//입력값과 아웃풋을 정할수있음

    val d={i:Int,j:Int->i*j} //타입을 써줘야 됨
    val f: (Int,String,Boolean)->String={_,b,_->b}
    //실 사용 예
     println(c(1)) //실행하려면 입력값을 넣어서 실행하면 됨

    hello(10,c)
}


fun hello(a:Int,c:(Int)->Int){
    println(a)
    println(c(20))
}


//함수형 인터페이스인 인자를 받는 구현해야 하는 추상메서드가 오직 하나뿐인 인터페이스를 코틀린에서는 람다식으로
//교체가 가능하다 sam 중요!!