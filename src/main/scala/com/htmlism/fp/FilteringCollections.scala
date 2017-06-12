package com.htmlism.fp

/**
  * We can call a filter method on a collection to yield a new copy of that collection where the filter is true. The
  * collections framework handles the creation of the new collection and filling it with values. This style
  * emphasizes what we want, not how we get there.
  */
object FilteringCollections extends App {
  val randomNumbers = Seq(86, 44, 62, 77, 25)

  val evenNumbers = randomNumbers.filter(n => n % 2 == 0)

  println(evenNumbers)
}
