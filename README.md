package demo

object demo {

  def temp_convert(celcius : Int):Double={
    var faran:Double = 0
    faran = celcius * 1.8 + 32
    return faran
  }

  def volume(radius : Double):Double={
    val pi = 3.14
    var volume:Double = 0
    volume = 4/3*pi*radius
    return volume
  }

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
    println("Faranheit Tempreture : " + temp_convert(35) + " F")
    println("Radius is : " + volume(5))
    println("Total Cost : " + cost(24.95, 60))
  }
}
