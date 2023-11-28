package com.example.kotlin.chapter2

fun main(){

    //let, run , applymalso with
    val a=3
    //1. let
    //수신 객체.let을 할수있고 {맨 마지막 줄은 return값이 된다.}
    //수신객체를 받을 걸 it이다 기본 변수
//    val age=user.let{ //it은 User를 뜻함
//        it.age
//    }
    a.let {  }
    val user:User?=User("채상아",10,true)
    user?.let {
        it.age
    }



    //2. run (let과의 차이점은 수신객체를 받는 방법)
    //수신객체.run {this->
    //
    //}마지막줄이 리턴값
    val kid=User("아이",4,false)

    //그냥 접근이 가능함
    val kidAge=kid.run {
        age
    }

    //3. apply
    //수신 객체.apply{this->
    // 얘는 어떤값을 쓰든 상관없은
    // 단 리턴값이 자기 자신이어야됨 - 클래스가 반환됨
    //}
    val kidName=kid.apply {
        name
    }
    val female=User("슬기",23,true,true)
    println(kidName.age)
    val fema=female.apply {
        hasGlasses=false
    }
    println(fema.hasGlasses)

    //4. also(수신객체에 대한 로그를 찍을때 사용함)
    //수신 객체.also{ it->//local variable
    //
    //
    //}//리턴은 수신 객체(자기자신)
    val male=User("민수",12,false,false)
    val mael1=male.also {
        it.name
    }
    println(mael1)


    //5. with
    //with(수신객체){
    // ---
    //
    //마지막줄
    //}
    val result=with(male){
        hasGlasses=false
        true
    }
}

class User(
    val name: String,
    val age:Int,
    val gender:Boolean,
    var hasGlasses:Boolean=true
)