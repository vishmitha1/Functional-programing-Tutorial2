object test{
  //var Tprice:Int=15
  var Attendence:Int =0
  def ticketprice(Tprice : Int)={  // calculate attentdence according to a ticket price
    if(Tprice==10){
      Attendence=120+20
    }
    else if(Tprice==20)
      Attendence=120-20
    else if(Tprice==15)
      Attendence=120 
  }

  def cost(Tprice : Int)={
    ticketprice(Tprice)
    500+Attendence*3
  }
  def profit(Tprice : Int)={
    Attendence*Tprice - cost(Tprice)
  }
  def bestprice(t1 :Int,t2 :Int) : Int={
    var val1 :Int=profit(t1)
    var val2 :Int=profit(t2)
    if (val1>val2)
      t1
    else
      t2
      
  }
  def main(args:Array[String])={
    var result=bestprice(bestprice(15,20),10);
    println(result)
    
  }
}