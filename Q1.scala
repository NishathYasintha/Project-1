package demo

object Q1 {

  def temp(celcius: Int): Double = {
    var faran: Double = 0
    faran = celcius * 1.8 + 32
    return faran
  }

  def main(args: Array[String]) = {
    println("Faranheit Tempreture : " + temp(35) + " F")
  }
}
