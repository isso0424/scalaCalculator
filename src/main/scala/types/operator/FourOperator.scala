package org.isso.scalaCalculator
package types.operator

case class FourOperator(operator: String) extends Operator {
  operator match {
    case "+" | "-" | "*" | "/" => operator
    case _ => throw new IllegalArgumentException()
  }
}
