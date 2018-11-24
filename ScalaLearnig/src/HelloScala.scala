import scala.util.matching.Regex

object HelloScala {
  def main(args:Array[String]):Unit={
   //"hello world. This is a learning work".split(' ').foreach(println)
   //"hello world.Let's see how String split works.".split(" ").foreach(println)
   //"hello, world, this, is, to, check, how, map, with, split, works".split(",").map(_.trim).foreach(println)
    
//    val numPattern="[0-9]+".r
//    val address="123 manhatton street 337"
//    var firstMatch=numPattern.findFirstIn(address)
//    println(firstMatch.get)
//    var allMatch=numPattern.findAllIn(address)
//    allMatch.foreach(println)
//    
//    val numPatternRegX=new Regex("[0-9]+")
//    firstMatch=numPatternRegX.findFirstIn(address)
//    println(firstMatch.get)
//    allMatch=numPatternRegX.findAllIn(address)
//    allMatch.foreach(println)
//    
//    val testString="No numeric vaue here"
//    val matchingString=numPatternRegX.findFirstIn(testString).getOrElse("NoMatchFound")
//    println(matchingString)
//    val matchingString1=numPatternRegX.findFirstIn(testString)
//    matchingString1 match
//    {
//      case Some(s)=>println(s"Found:$s")
//      case None=>println("No match found")
//    }
//    
//    println(address.replaceAll("[0-9]","x"))
//    println(address.replaceFirst("[0-9]","x"))
    
//    val name:String="subrat"
//    val age:Int=30
//    val company:String="CTS"
//    
//    println(s"$name of $age is working for $company")
//    
//    val number:Int=22
//    println(s"${if (number%2==0) "even" else "odd" }")
//    
//    case class Employee(name:String,designation:String,sal:Double)
//    val emp=Employee("subrat","sa",20000)
//    println(s"${emp.name} ${emp.designation} ${emp.sal}")
//    
//    println(s"this is first line \n this is second line")
//    println(raw"this is first line \n this is second line")
//    
//    println("%s is an employee of %s of age %d".format(name,company,age))
    
    var pattern="([0-9]+) ([A-Za-z]+)".r
    var pattern(count,fruit)="100 Bananas";
    println(count+":"+fruit)
    
    var searchedNumber: Int = 109
    var firstIndex: Int = 0
    var lastIndex: Int = 0
    var myArr = Array(2, 3, 18, 19, 32, 44, 49, 51, 61, 98, 109, 123, 210)
    var midPoint: Int = myArr.length / 2

    while (myArr(midPoint) != searchedNumber) {
      if (myArr(midPoint) < searchedNumber) {
        firstIndex = midPoint;
        lastIndex = myArr.length - 1;
      } else {
        firstIndex = 0;
        lastIndex = midPoint;
      }

      var length:Int=lastIndex-firstIndex+1;
      println(length)
      var finalArr: Array[Int] = Array[Int](length);
      var index: Int = 0;
      for (i <- firstIndex to lastIndex) {
        finalArr(index) = myArr(i)
        index = index + 1
      }

      myArr = finalArr
      midPoint = myArr.length / 2
    }
  }  
}