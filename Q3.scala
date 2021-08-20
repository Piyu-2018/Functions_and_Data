object Q3 extends App{

  val account1= new Bankacco("peter",10035,100.00)
  val account2= new Bankacco("tom",10045,30.00)

  account1.transfer(account2,50.00)
  println("Balances After money transfer.")
  println(account1)
  println(account2)
}

class Bankacco(id:String,a:Int,b:Double){
  var nic:String=id
  var accountnumber:Int =a
  var balance:Double =b

  def withdraw(a:Double){
    this.balance=this.balance-a
  }

  def deposit(a:Double){
    this.balance=this.balance+a
  }

  def transfer(acc:Bankacco,a:Double)={
    this.withdraw(a)
    acc.deposit(a)
  }

  override def toString = "["+nic+":"+accountnumber+":"+balance+"]"

}