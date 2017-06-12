package com.htmlism.fp

import scala.annotation.tailrec

object Recursion extends App {
  val numbers = Seq(86, 44, 62, 77, 25)

  @tailrec
  def sum(xs: Seq[Int], acc: Int = 0): Int =
    xs match {
      case head :: tail =>
        sum(tail, acc + head)

      case Nil =>
        acc
    }

  println(sum(numbers))
}

object RecursionWhile extends App {
  var numbers = Seq(86, 44, 62, 77, 25)

  var acc = 0

  while (numbers.nonEmpty) {
    acc = acc + numbers.head
    numbers = numbers.tail

    if (numbers.isEmpty)
      acc = Recursion.sum(numbers, acc)
  }

  println(acc)
}
