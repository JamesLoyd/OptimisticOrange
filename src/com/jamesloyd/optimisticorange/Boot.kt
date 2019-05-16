package com.jamesloyd.optimisticorange

fun main(){
    Boot().showAHello()
    Test.doTheThing()
}

class Boot {
    fun showAHello(){
        println("Hello world I am James Loyd")
    }
}

interface IThingDoer{
    fun doTheThing(){
        println("So interfaces can define method bodys...")
    }
}

object Test : IThingDoer