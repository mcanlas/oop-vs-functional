package com.htmlism.fp

import scala.annotation.tailrec

/**
  * Some languages have an optimization called "tail recursion". This optimization allows functions to be written in a
  * recursive style and be executed without incurring the cost of a deep execution stack for long inputs.
  *
  * Notice how the recursive case for this function consists only of a call to the function, without any outer
  * expression. A compiler can flatten this recursion into a loop since the value for the recursive case can be
  * thought of as a new, isolated function each time.
  *
  * The `@tailrec` annotation allows Scala to assert that this function can be optimized as tail recursive.
  */
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

/**
  * This is how a compiler might unravel the tail recursion above into a `while` loop.
  */

object RecursionWhile extends App {
  var numbers = Seq(86, 44, 62, 77, 25)

  var acc = 0

  while (numbers.nonEmpty) {
    acc = acc + numbers.head
    numbers = numbers.tail
  }

  println(acc)
}
