package fpinscala.gettingstarted

object Ex2 extends App {

  // Exercise 1: Write a function to compute the nth fibonacci number

  def fib(n: Int): Int = {
  	n match {
  		case 0 => 0
  		case 1 => 1
  		case _ => fib(n-1) + fib(n-2)
  	}
  }
}