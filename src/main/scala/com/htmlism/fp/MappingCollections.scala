package com.htmlism.fp

/**
  * We can call a map method on a collection to yield a new copy of that collection where each value is updated. The
  * collections framework handles the creation of the new collection and filling it with values. This style
  * emphasizes what we want, not how we get there.
  */
object MappingCollections extends App {
  val randomNumbers = Seq(86, 44, 62, 77, 25)

  val biggerNumbers = randomNumbers.map(n => n * 2)

  println(biggerNumbers)
}
