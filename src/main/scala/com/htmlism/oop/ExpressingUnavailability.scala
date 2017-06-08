package com.htmlism.oop

object ExpressingUnavailability extends App {
  def getEven(n: Int) =
    if (n % 2 == 0)
      n
    else
      null

  val answer = getEven(5)

  if (answer == null)
    println(s"input was odd!")
  else
    println(s"$answer is even")
}
