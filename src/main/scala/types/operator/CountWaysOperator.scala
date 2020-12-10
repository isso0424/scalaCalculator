package org.isso.scalaCalculator
package types.operator

case class CountWaysOperator(operator: String) extends Operator {
  operator match {
    case "C" | "P" => operator
    case _ => throw new IllegalArgumentException()
  }
}
