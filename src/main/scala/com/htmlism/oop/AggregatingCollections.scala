package com.htmlism.oop

/**
  * Aggregating or summarizing a collection often starts with an accumulator set to a "zero" value, which could be a
  * literal zero or something like an empty string or empty collection. Then for each iteration of a loop, values from
  * the source collection are incorporated mutably into the accumulator.
  *
  * After the aggregation is complete, the accumulator is still mutable, which can be dangerous.
  */
object AggregatingCollections extends App {
  val numbers = Seq(86, 44, 62, 77, 25)

  var sum = 0

  for (n <- numbers)
    sum += n

  println(sum)
}
