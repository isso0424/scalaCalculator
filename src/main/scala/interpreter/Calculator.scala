package org.isso.scalaCalculator
package interpreter

import types.operator.{CountWaysOperator, FourOperator}

import org.isso.scalaCalculator.types.calculator.params.{CountWaysParams, FourParams}
import org.isso.scalaCalculator.types.calculator.processor.{CountWaysProcessor, FourProcessor}

object Calculator {
  def twoParametersCalculator(x: Double, y: Double, rawOperator: String): Double = {
    val operator = rawOperator match {
      case "+" | "-" | "*" | "/" => FourOperator(rawOperator)
      case "C" | "P" => CountWaysOperator(rawOperator)
      case _ => throw new IllegalArgumentException()
    }

    operator match {
      case operator: FourOperator => FourProcessor.calculation(FourParams(x, y, operator))
      case operator: CountWaysOperator => CountWaysProcessor.calculation(CountWaysParams(x.toInt, y.toInt, operator))
    }
  }
}
