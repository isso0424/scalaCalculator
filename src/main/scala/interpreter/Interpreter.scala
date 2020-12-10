package org.isso.scalaCalculator
package interpreter

object Interpreter {
  def exec(): Unit = {
    println("Please input parameters count.")
    Inputter.getOneDouble match {
      case 2 =>
        println("Please input first term.")
        val x = Inputter.getOneDouble
        println("Please input second term.")
        val y = Inputter.getOneDouble
        println("Please input operator.")
        val operator = Inputter.getOneItem

        printf("Result: %f\n", Calculator.twoParametersCalculator(x, y, operator))
      case _ => throw new IllegalArgumentException()
    }
  }
}
