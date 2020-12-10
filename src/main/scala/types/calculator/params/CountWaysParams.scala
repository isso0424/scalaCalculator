package org.isso.scalaCalculator
package types.calculator.params

import types.operator.CountWaysOperator

case class CountWaysParams(x: Int, y: Int, operator: CountWaysOperator) extends Params
