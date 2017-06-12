package com.htmlism.oop

object Recursion extends App {
  val numbers = Seq(86, 44, 62, 77, 25)

  def sum(xs: Seq[Int]): Int =
    if (xs.isEmpty)
      0
    else
      xs.head + sum(xs.tail)

  println(sum(numbers))
}
