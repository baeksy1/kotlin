package com.example.kotlin.chapter1

fun main(){
    max(11,3)
    isHoliday("수")

}

//자바와 코틀린의 조건식의 차이는 조건문으로 나오고 코틀린은 해당 값을 꺼내서 사용할 수 있음.
//자바와 다르게 삼항연산식은 안되지만 {}를 생략할수있다.
//자바는 SWICH문을 사용하지만 코틀린은 WHEN문을 사용함
fun max(a:Int, b:Int){
    val result=if(a>b){
        println(a)
    }else{
        println(b)
    }
    println(result)

}

// 월 화 수 목 금 토 일
fun isHoliday(dayOfWeek : String){

    val result= when(dayOfWeek){//식으로 사용할때 값이 없을 경우 else를 써야 됨
        "월",//똑같은 조건은 컴마로 나열하면 됨
        "화",
        "수",
        "목",
        "금"-> if (dayOfWeek == "수") "굳" else "엥ㅋㅋㅋ"
//        "토"->true
//        "일"->true
//        in 2..4->{}
//        in listOf("월","화")->{}
        else->true

    }
    println(result)
}