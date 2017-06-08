package com.htmlism.oop

object IterateArray extends App  {
  val animals = Array("cat", "dog", "bird", "frog")

  // a counting variable is established in the current scope, leaving it available for use after iteration is complete
  var i = 0

  // much of the code here is boiler plate. although this pattern allows for more complex logic and access to the
  // entire collection, iteration will most often look like this
  while (i < animals.length) {
    println(animals(i))

    i += 1
  }

  // this pattern has easier access to each element's index

  i = 0

  while (i < animals.length) {
    val a = animals(i)

    println(s"$i: $a")

    i += 1
  }
}
