package oops

class Student(
               val firstName: String,
               val lastName: String,
               val quizs:List[Int]=Nil,
               val assignments: List[Int]=Nil,
               val tests : List[Int]=Nil) {


  def assign_average : Double =if(assignments.isEmpty) 0.0
                              else assignments.sum.toDouble/assignments.length
  def test_average : Double = if(tests.isEmpty) 0.0
                              else tests.sum.toDouble/tests.length
  def quiz_average : Double = if(quizs.isEmpty) 0.0
                              else quizs.sum.toDouble/quizs.length
  def average : Double = quiz_average* 0.1 + test_average *0.2 + assign_average* 0.3




}
