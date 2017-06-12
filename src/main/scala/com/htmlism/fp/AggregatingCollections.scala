package com.htmlism.fp

/**
  * A collection's fold function will handle the initialization of the "zero" value and return the final
  * accumulated value.
  */
object AggregatingCollections extends App {
  val numbers = Seq(86, 44, 62, 77, 25)

  val sum = numbers.fold(0)((acc, e) => acc + e)

  println(sum)
}

/**
  * Because the summing of numbers is so common, there may also be a `sum` method provided.
  */
object AggregatingCollectionsSum extends App {
  val numbers = Seq(86, 44, 62, 77, 25)

  val sum = numbers.sum

  println(sum)
}
