package edu.knoldus.com

class Sorting {
  def Isort(list: List[Int]): List[Int] = {
    if (list.isEmpty) Nil
    else insert(list.head, Isort(list.tail))
  }

  def insert(x: Int, list: List[Int]): List[Int] =
    if (list.isEmpty || x <= list.head) x :: list
    else list.head :: insert(x, list.tail)

}
object main extends App {
  val list = List(9,1,25,30,12,78)
  val obj = new Sorting
  println(obj.Isort(list))
}






