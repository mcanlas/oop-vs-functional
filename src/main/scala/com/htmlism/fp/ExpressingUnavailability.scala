package com.htmlism.fp

object ExpressingUnavailability extends App {
  def getEven(n: Int): Option[Int] =
    if (n % 2 == 0)
      Some(n)
    else
      None

  val answer = getEven(5)

  answer match {
    case Some(n) =>
      println(s"$n is even")

    case None =>
      println(s"input was odd!")
  }
}
