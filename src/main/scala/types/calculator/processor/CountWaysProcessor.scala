package org.isso.scalaCalculator
package types.calculator.processor

import types.calculator.params.CountWaysParams

class CountWaysProcessor extends Processor[Int, CountWaysParams]{
  import CountWaysProcessor._
  override def calculation(params: CountWaysParams): Int = {
    params.operator match {
      case "C" => combination(params.x, params.y)
      case "P" => permutation(params.x, params.y)
      case _ => throw new IllegalArgumentException();
    }
  }
}

object CountWaysProcessor {
  def factorial(x: Int): Int = (1 to x).product

  def permutation(x: Int, y: Int): Int = factorial(x) / factorial(x - y)

  def combination(x: Int, y: Int): Int = permutation(x, y) / factorial(y)
}