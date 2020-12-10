package org.isso.scalaCalculator
package interpreter

import scala.util.control.Breaks.break

object Inputter {
  def getOneItem: String = {
    var array: Array[String] = Array()
    while (array.isEmpty)
      array = io.StdIn.readLine.split(" ")
    array.head
  }

  def getOneDouble: Double = {
    var value: Double = 0.0
    while (true) {
      try {
        value = getOneItem.toDouble
        return value
      } catch {
        case _: NumberFormatException => println("Please input number")
        case e => throw e;
      }
    }

    value
  }
}
