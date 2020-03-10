package com.atguigu.scalal1015.day07.generic

/**
 * Author atguigu
 * Date 2020/3/10 11:46
 */
case class AA(val age: Int) extends Ordered[AA]{
    override def compare(that: AA): Int = age - that.age
}
object Generic2 {
    def main(args: Array[String]): Unit = {
        println("a" < "b")
        val aa = compare(new AA(10), new AA(20))
        println(aa)
        
        val max: Int = compare(10, 20)
        println(max)
        
    }
    
    def compare[T <: Ordered[T]](x: T, y: T):T = {
        if(x > y) x
        else y
    }
}
/*
泛型的上下界(上下限)

上限


下限
 */