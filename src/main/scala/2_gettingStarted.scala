package fpinscala.gettingstarted

object Ex2 extends App {

  // Exercise 1: Write a function to compute the nth fibonacci number

  def fib(n: Int): Int = {
  	if (n == 0) 0
  	else if (n == 1) 1
  	else fib(n-1) + fib(n-2)
  }

}