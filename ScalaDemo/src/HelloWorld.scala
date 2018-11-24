object HelloWorld{
  def main(args: Array[String]): Unit = {
  println(Add(10,20))
  PrintList
  }
  
  def Add(x:Int,y:Int):Int={
    return x+y
  }
  
  def PrintList={
    val list=List(1,2,3,4,5,6,7,8,9,10)
    list.foreach(x=>println(x))
  }
}

class Student1(var id:Int,var name:String,val dept:String,fee:Double){
  private var concession:Float=10;
  def getConcession():Float={
    println("Inside get concession and my fee is:"+fee)
    concession
  }
  
  def setConcession(concession:Float){
    this.concession=concession;
  }
}

case class Emp(id:Int,name:String){}
//--Auxillary constructor.
class Student(var id:Int,var name:String,val dept:String="dept_x",fee:Double){
  println("+++++INSIDE STU CLASS++++")
  private var concession:Float=10.0f;
  def getConcession():Float={
    println("Inside get concession and my fee is:"+fee)
    concession
  }
  def setConcession(concession:Float){
    this.concession=concession;
  }
  
  def this(id:Int,name:String){
     this(id,name,fee=2000.0f)
    println("+++Inside auxiillary constructor++++")   
  }
  
  def this(){
    this(id=100,"default",fee=200)
    println("++++Studet Constructorwith no parameter++++2")
  }
  
}

//--companion object
object Student{
  val hobbies="reading"
  def getConnection(){
    println("Inside cnnection method.")
  }
}

case class Emp1(id:Int,name:String,dept:String,sal:Float)
{
  //val e1=Emp(1,"emp1","dept1",100.0f)
  //val e2=e1;//here a deep copy happens.Variable to variable mapping
}