package demo

object Q3 {
  def cost(price:Double , copies:Int):Double={
    val discount = price * (40).toDouble./(100:Double)
    var Tot = price - discount

    if(copies < 50){
      Tot = Tot + 3
    }
    else{
      Tot = (Tot + 3) + (copies - 50)* 0.75
    }
    return Tot
  }

  def main(args: Array[String]) = {
    println("Total Cost : " + cost(24.95, 60))
  }
}
