package com.htmlism.oop

import scala.collection.mutable

/**
  * A traditional way of mapping often starts with creating a new empty collection to place values into. The code
  * is very explicit about its mechanics. If the mapping function were more complex, the idea that this is "just a
  * map" could be lost in the code.
  */
object MappingCollections extends App {
  val randomNumbers = Seq(86, 44, 62, 77, 25)

  val biggerNumbers = new mutable.ListBuffer[Int]

  for (n <- randomNumbers)
    biggerNumbers += n * 2

  println(biggerNumbers)
}
