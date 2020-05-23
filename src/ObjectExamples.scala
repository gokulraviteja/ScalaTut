import java.io.PrintWriter
import scala.io.Source


object ObjectExamples {

  def buildList() : List[String] ={
    val input=readLine();
    if(input=="quit") Nil
    else input:: buildList()
  }

  def concat(words : List[String]) : String ={
    if(words.length==1) words(0)
    else words.head+","+concat(words.tail)
  }

  def concatPat(words : List[String]) : String = words match {
    case Nil => ""
    case h :: t => h+","+concatPat(t)
  }

  def named(a : Int =1 , b: Int =2, c : Int =3)={
  }

  def non_curry(a: Int, b:Int) : Int = a+b
  def curry(a: Int)(b: Int) : Int = a+b


  // passing a var
  def gettriple(a: Double) : (Double,Double,Double)={
    return (a,a,a)
  }
  // pass a func
  def gettriple1(a:()=> Double) : (Double,Double,Double)={
    // we need to call it differently   like this ------     gettriple1(()=> math.random)
    return (a(),a(),a())
  }
  // pass by name
  def gettriple2(a: => Double) : (Double,Double,Double)={
    //simple way to pass func
    return (a,a,a)
  }


  def noncurrynonpass(a: Double, f: => Double): Double ={
    a+f
  }









  def main(args: Array[String]): Unit = {
//    val lst=buildList()
//    println(lst)
    println(concat(List("Hello", "brother","Hah")))
    val Array(a,b,c) = "one 2 3 ".split(" ")

    // Option

    val arr=Array(2,1,3,4,5,6)
    val k=arr.find(_<5)
    val k1=arr.find(_<1)

    println(arr.find(_<5))
    println(arr.find(_<1))

    // Find func returns an option which will be either some or none

    println(k.get) // but if k is none it will give an error .

    //one way
    k match {
      case Some(i) => println(i)
      case None => println(0)
    }
    // more simple way
    println(k.getOrElse(0))
    println(k.map(_*2))
    println(k1.map(_*2))


    // File
    val pw=new PrintWriter("abc.txt")
    pw.write("12 23 12\n")
    pw.write("76 31 15")
    pw.close()



    val source=Source.fromFile("abc.txt")
    val lines=source.getLines()
    val matrix=lines.map(line => line.split(" ").map(_.toDouble)).toArray
    matrix.foreach(line => line.map(println))
    source.close()




    // Named arguments and default values
    named(a=12,c=14)

    // currying and pass-by-name

    non_curry(1,2)
    val fun1=curry(2)_
    println(fun1(2))

    gettriple(math.random)
    gettriple1(()=> math.random)
    gettriple2(math.random)
    println(noncurrynonpass(2,math.random))



  }
}
