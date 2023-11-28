package com.example.kotlin.chapter1

fun main(){
 //자바에서는 컴파일 단계에서 null을 체킹할수없음 즉,직접 실행해야 null이 나오는걸 알수있음
    //코틀린에서는 랭귀지 단계에서 null이 될수있는 값과 없는 값을 구분할수있음
    var name:String="승용"
//    name=null
    var number : Int=10;
//    number=null
    var nickname : String?="null" //?를 붙이면 null값을 포함시킬 수 있음

//    val result=if(nickname==null){ //원래는 null일떄 예외처리를 했었음
//        "값이 없음"
//    }else{
//        nickname
//    }
    //코틀린에서는 이렇게 예외 처리를 함 *****************
    nickname=null
//    val result = nickname?:"값이 없음"
    val size=nickname?.length //null일때 예외처리를 안하고 여기서 멈추고 null을 반환함 ?를 쓰지 않으면 아예 오류가 떠버림
    println(size)
}


