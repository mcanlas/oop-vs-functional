package com.htmlism.oop

/**
  * Recursion exists in object-oriented programming, but isn't used often. During execution, the depth of the
  * execution stack is directly proportional to the length of the input, making style of coding unsuitable for
  * large inputs.
  *
  * A recursion function will often have two parts: the base case and the recursive case. Notice how the recursive call
  * is a part of the overall expression that is the recursive case. The value for the recursive case cannot be known
  * unless all of the calls inside of it have resolved.
  */
object Recursion extends App {
  val numbers = Seq(86, 44, 62, 77, 25)

  def sum(xs: Seq[Int]): Int =
    if (xs.isEmpty)
      0
    else
      xs.head + sum(xs.tail)

  println(sum(numbers))
}
