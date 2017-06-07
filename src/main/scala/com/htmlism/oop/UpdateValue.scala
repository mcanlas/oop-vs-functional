package com.htmlism.oop

/**
  * Variables are modified in-place. After mutation, the same variable name can be reused to receive the latest value.
  */
object UpdateValue extends App {
  var someValue = 4

  println(s"Old value: $someValue")

  someValue = someValue + 1

  println(s"New value: $someValue")
}
