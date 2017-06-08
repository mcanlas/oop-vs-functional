package com.htmlism.fp

object IterateArray extends App {
  val animals = Array("cat", "dog", "bird", "frog")

  // the foreach loop idiom automatically extracts and isolates each element from the collection
  // the lack of a counter leaves less room for typos and off-by-one errors
  // this pattern prevents arbitrary access and allows each iteration access to only one element
  for (a <- animals) {
    println(a)
  }

  // foreach may also be a method off of each collection
  animals.foreach { a => println(a) }

  // if access to an index is necessary, a new collection is built with each index bound to its element in a tuple
  animals.zipWithIndex.foreach { case (a, i) =>
    println(s"$i: $a")
  }
}
