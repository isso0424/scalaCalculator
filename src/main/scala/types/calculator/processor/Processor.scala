package org.isso.scalaCalculator
package types.calculator.processor

import types.calculator.params.Params

abstract class Processor[T] {
  def calculation(params: Params): T
}
