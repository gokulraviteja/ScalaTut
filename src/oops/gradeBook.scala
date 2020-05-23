package oops
import oops.Student

object gradeBook {
  def main(args: Array[String]): Unit = {


    val students= List(new Student("ravi","teja"),new Student("gokul","ravi"))
    val s1=new Student("ravi","teja")
    val s2=new Student("gokul","ravi")
    students.foreach(printStu)

  }

  def printStu(s: Student): Unit ={
    println("Firstname " +s.firstName)
    println("Grade "+s.test_average)
  }

}
