object Q4 extends App{

  val account1= new Bankacc("Peter",11050,9000.00)
  val account2= new Bankacc("Tom",11040,-1000.00)
  val account3= new Bankacc("Sam",11020,10000.00)
  val account4= new Bankacc("Ben",11040,2000.00)

  var bank:List[Bankacc]=List(account1,account2,account3,account4)

  val overdraft = bank.filter(x=>x.balance<0)
  val balance = bank.map((x)=>(x.balance)).reduce((x,y)=>(x+y))
  val interest = (b:List[Bankacc])=>b.map((x) => (x.nic,x.accnumber,if(x.balance>0)  (x.balance+(x.balance*0.5)) else (x.balance+(x.balance*0.1)) ))

  println(overdraft)
  println(balance)
  println(interest(bank))

}

class Bankacc(id:String,a:Int,b:Double){

  var nic:String=id
  var accnumber:Int =a
  var balance:Double =b

  override def toString = "["+nic+":"+accnumber+":"+balance+"]"

}


