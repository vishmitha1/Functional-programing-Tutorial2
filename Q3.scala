object test{
    def OT(ot:Int)=85*ot;
    def Normal( n:Int)=n*250;
    def Total(ot :Int, n:Int)={
        4*(OT(ot)+Normal(n))*88/100;
    }
    
    def main(args:Array[String])={
        println(Total(30,40));
    }
}