object test{
    var a :Int =2;
    var b :Int =3;
    var c:Int =4;
    var d:Int= 5;
    var k:Float =4.3f;
    def funA(a:Int , b:Int ,c:Int,d:Int)={
        //( - -b * a + c *d - -)
        
    }
    def main(args:Array[String])={
        //Can't use prefix and suffix in scala therefor cant print ( - -b * a + c *d - -)
       b-=1
       println( b * a + c *(d ) );
       a=a+1
       println(a)
      // println (-2 * ( g - k ) +c); g is not  an initialized variable
       //can't print (c=c++) because scala not support this
       c=c+1
       println(c)
       c=c+1
       a=a+1
       println(c*a)
    }
}