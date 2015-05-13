package fpinscala.gettingstarted

import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers

import Ex2._

class Ex2Spec extends FunSpec with ShouldMatchers {

  it("2.1 fib") {
    fib(0) should equal(0)
    fib(11) should equal(89)
  }

}