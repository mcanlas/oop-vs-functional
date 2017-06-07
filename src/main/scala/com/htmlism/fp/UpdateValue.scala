package com.htmlism.fp

/**
  * Values are "modified" by created new ones based off of immutable copies of the old ones.
  */
object UpdateValue extends App {
  val oldValue = 4

  // the commented code below will not compile. you cannot modify immutable values
  // oldValue = oldValue + 1

  println(s"Old value: $oldValue")

  val newValue = oldValue + 1

  println(s"Old value: $newValue")
}
