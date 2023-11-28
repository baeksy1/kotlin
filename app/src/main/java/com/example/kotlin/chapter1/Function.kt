package com.example.kotlin.chapter1

fun main(){
    println("hello world");
   val result= test1(a= 1,b=2)
    println(test3(1,3))

}


//2. 함수
fun test(a: Int, b:Int):Int{
    println(a+b)
    return a+b
}

//오버로딩할 필요없이 디폴트 값으로 넣어둘수있음
fun test1(a:Int , b:Int ,c:Int=5):Int{

    println (a+b)
    return a+b
}

fun test2(name:String,nuckname:String,id:String)=println(name+nuckname+id) //이런식으로 한줄이면=으로 생략가능
fun test3(a:Int,b:Int)=a*b