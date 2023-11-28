package com.example.kotlin.chapter1

fun main(){
    val user= User("채상아")
    println(user.age)

    val kid= kid("승용", "male")
    println(kid.gender)
}
//private을 넣으면 값을 숨길수있음
//함수와 마찬가지로 고정값을 넣을 수 있다 age:Int=100 하지만 선언할때 값을 넣으면 그 값이 우선이 된다
open class User(open val name: String, var age:Int=100)
//open을 붙여야 상속 가능함

//상속 값에 open을 넣으면 상속을 받을 수 있음 override 를 넣으면 됨
class kid(override val name: String): User(name){
    var gender:String="female"

    //init{가장 먼저 실행 됨 프레그먼트 초기화 할때 사용함 (클래스 만들어지는 시점보다 먼저 초기화 해야될때.)}


    //부상속자
    constructor(name:String,gender:String):this(name){
        this.gender=gender
        println("부생성자 호출")
    }
}