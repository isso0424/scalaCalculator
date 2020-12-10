package org.isso.scalaCalculator
package types.calculator.processor
import types.calculator.params.{FourParams, Params}

object FourProcessor extends Processor[Double, FourParams] {
  override def calculation(params: FourParams): Double = {
    params.operator.operator match {
      case "+" => params.x + params.y
      case "-" => params.x - params.y
      case "*" => params.x * params.y
      case "/" => params.x / params.y
      case _ => throw new IllegalArgumentException()
    }
  }
}
