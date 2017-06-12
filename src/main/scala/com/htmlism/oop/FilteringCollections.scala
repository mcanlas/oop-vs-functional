package com.htmlism.oop

import scala.collection.mutable

/**
  * A traditional way of filtering often starts with creating a new empty collection to place values into. The code
  * is very explicit about its mechanics. If the filter expression were more complex, the idea that this is "just a
  * filter" could be lost in the code.
  */
object FilteringCollections extends App {
  val randomNumbers = Seq(86, 44, 62, 77, 25)

  val evenNumbers = new mutable.ListBuffer[Int]

  for (n <- randomNumbers)
    if (n % 2 == 0)
      evenNumbers += n

  println(evenNumbers)
}
