object Q2 extends App{

  val x = new Rationals(3,4)
  val y = new Rationals(5,8)
  val z = new Rationals(2,7)
  val r= x-y-z

  println(r)
}

class Rationals(a:Int,d:Int){
  require(d>0,"d must be greater than 0")
  def numer=a/gcd(math.abs(a),d)
  def denom=d/gcd(math.abs(a),d)
  def this(m:Int)=this(m,1)
  private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b)
  def +(r:Rationals) = new Rationals(this.numer * r.denom + r.numer * this.denom, denom * r.denom)
  def neg = new Rationals(-this.numer,this.denom)

  def -(r:Rationals) = this + r.neg
  override def toString = numer + "/" + denom

}