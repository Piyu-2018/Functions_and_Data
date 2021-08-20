object Q1 extends App{
    val num1 = new Rational(3, 8)

    println(num1)
    println(num1.neg)
}

class Rational(x:Int, y:Int){

  private def gcd(x:Int, y:Int):Int = if(y == 0) x else gcd(y, x % y)

  private val g = gcd(Math.abs(x), Math.abs(y))
  val numer = x / g
  val denom = y / g

  def neg = new Rational(- this.numer, this.denom)

  override def toString = this.numer.toString + " / " + this.denom.toString
}
