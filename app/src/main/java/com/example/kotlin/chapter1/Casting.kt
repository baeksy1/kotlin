package com.example.kotlin.chapter1

fun main(){
//    println(check("안녕"))
//    println(check(3))
//    println(check(true))
    cast("안녕")
    cast(3)
    smartcast("오232우")
    smartcast(3)
    smartcast(true)
}
//fun check(a:Any):String{
//   return when(a is String){
//        "문자열"
//    }else if(a is Int){
//        "숫자"
//    }else{
//        "몰라"
//    }
//}


fun cast(a:Any){
    //a를 strign 으로 받겠다라는 뜻 만약 string으로 변할수 없는 상태엔 ?를 붙이면 됨
    val result=(a as? String)?:"실패~"
    println(result)
}

//타입을 체킹해서 자동으로 이렇게 해줄수있음
fun smartcast(a:Any){
    val result=if(a is String){
        a.length
    }else if(a is Int){
        a.dec() //숫자 빼기 1
    }else{
        "오우~"
    }
    println(result)
}
