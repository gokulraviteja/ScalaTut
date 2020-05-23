object Main {

  //Variables and DataTypes
  // var and val
  var anr=0
  val anl=1
  anr+=1

  //String, Int, Double, Char, Boolean, Unit
  var name="Gokul"
  var age=21
  var unit_example=()
  println(unit_example)

  //Tuple
  var t=(1,2,4.4,"Hello")
  var (a,b,c,d)=t
  var (e,f)= (t._1,t._2)
  println(t._1)

  //String Interpolation
  var st=name +" is "+age+" years old"
  var st1=s"$name is $age years old"
  st=name +" is "+(age+1)+" years old"
  st1=s"$name is ${age+1} years old"
  println(st1)

  //expressions
  anr + anl
  anr.+(anl)
  anr min anl
  anr.min(anl)
  anr  min anl +5    // which is equal to anr.min(anl+5)    + have more precedence than min
  name == "HELLo"    // can compare strings using ==
  name= "Hello" *5   // concatenates as python

  //Lambda expressions (closures or function literals) using =>
  val square= (x: Double) => x*x
  val square2 : Double => Double = x => x*x
  val twice : Double => Double = x => x*2
  val twice2 : Double => Double = _ * 2   // _ can be used only if the arguments are only used once in the expression
                                         // as in the case of square x*x x is used twice so _ cannot be used
  val mul : (Double,Double) => Double = _ * _
  val lt : (Double, Double) => Boolean = _ < _

  println("Lambdas")
  println(square2(3))
  println(twice(4))
  println(mul(3,4))
  println(lt(4,5))

  //While - DoWhile
  var it=0
  while(it<3){
    it+=1;
  }

  do{
    it+=1
  }while(it<5)


  // If-Else
  if(age >18){
    var result="Pro"
  }
  else{
    var result="noob"
  }

  var result=if(age>18){
    "Pro"
  }
  else{
    "noob"
  }

  println( if(age>18) "Pro" else "noob" )    // Preferred both if and else should return same type

  //For-Loop

  for(i <- 0 to 10){
    square(2)
  }
  for(i <-0 until 5){
    square(2)
  }
  for(i <-0 until 10 ; if i%2==0 || i%3==0  ){
    //For loop with condition
  }
  for(i <- 0 until 5; j<-'a' until 'd'){
    //Nested for loop
  }
  for(i <- 0 until 1; sq="Var that can be used inside for"){
    println(sq)
  }
  for{
    i <- 0 until 1
    sq="Var that can be used inside for"
    //No need of semicolons
  }
    {
      //Actual code in loop
    }

  val stuff=for(i<-0 to 3)
  yield{
    i
  }
  println(stuff)

  //Match
  val fizzbuzz=for(i<- 0 to 5){
    (i%2)match{
      case 0 => "even"
      case 1 => "odd"
      case _ => "i doubt whether it exists or not hah"
    }
  }

  // try catch
  var in="123"
  val tried=try{
    in.toInt
  }
  catch {
    case ex:NumberFormatException => 0
  }
  println("TRIED MAN ! BUT => ", tried)

  // Arrays and Lists - collections
  //Arrays- Mutable , Lists- not mutable
  var list=List('a','b','c')
  var array=Array(1,2,3,4)
  println(list)
  println('f'::list) // add 'f' to start of list
  // use list if u have variable length and array if mutable and fixed length


  // fill and tabulate
  Array.fill(3)(0) // creates array of length 3 with values 0
  List.fill(5)(math.random)
  Array.tabulate(3)(i=> i*i)
  new Array[Int](10)

  //Ranges

  1 to 10
  println(1.to(5))
  'a' to 'f'
  1 to 10 by 2 // 1 ,3,5,7,9  (interval 2)
  10 to 1 by -1
  0.1 to 2.2 by 0.1

  array.head
  array.tail
  array.last
  array.drop(2)// drop first 2 elements
  array.dropRight(2) // last 2 ele
  array.length
  array.splitAt(3) // split at an index
  array.take(3)  // take first 3 elememts
  array.takeRight(3)
  array.slice(2,5)
  array.patch(2,Array(1),3) // starting from index 2 replace 3 elements with that new array
  array.diff(Array(2,4))  // remove 2, 4 from array if they exists if duplicate exists it remove only one
  array.distinct
  array.intersect(Array(3,6))
  array.union(Array(2,1))
  array.min
  array.sum
  array.product
  array.sorted
  array.mkString
  array.mkString(",")
  println(array.mkString("[",", ","]"))
  var zi=array.zip('a' to 'z') // gives list of tuples
  println(zi(2))
  array.zipWithIndex

  // Higher order functions , Func which takes func as arguments
  array.foreach(println)
  array.map(i => i*2)
  array.map(_*2)
  array.filter(_<5)
  array.filter(_%2==0)
  array.count(_%2==0)
  array.exists(_< 5 )
  array.forall(_ < 5) // returns true if all elements < 5
  println(array.find(_%3==0))
  array.partition(_<5)
  array.reduce(_+_)


  // Strings as seq
  val str_arry = Array("a","bb","ccc","dddd")
  println(str_arry.minBy(_.length))
  "This is a leng".filter(_<'l')
  "This is a leng".filter(c => "aeiou".contains(c))
  "This is a leng".split(" ")
  println(("This is a    leng".split(" ")).foreach(println))


  def main(args: Array[String]): Unit = {
    println("Hello World");

  }


}
