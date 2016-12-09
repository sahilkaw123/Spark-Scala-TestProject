/**
  * Created by sahilkaw on 9/24/16.
  */
class demo{
  def methodFromClass(input:Int): Int ={
    println("I am from the method")
    input
  }
}
object demo {
  def main(args: Array[String]): Unit = {
    println("I am Kaw's first scala program ")
    val obj = new demo

    println(obj.methodFromClass(8))
  }
}
