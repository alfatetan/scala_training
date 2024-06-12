class HiClass (var name: String) {
  println(s"Hello, $name")

  def printHiOneMoreTimes(): Unit = {
    println(s"One more time, hello ${name}")
  }
}

//val hiInstance = new HiClass("World")
//hiInstance.name = "Galaxy"
//hiInstance.printHiOneMoreTimes()
//
//class Rational(val n: Int, val d: Int) {
//  override def toString: String = s"R($n/$d)"
//}
//
//val half = new Rational(1, 2)
//half.getClass

//val divByZero = new Rational(1, 0)

class ToStringExample(val a: Int, val b: Int) {
  val result: Int = a + b
//  override def toString: Boolean = false
//    println(s"This is rewriting toString method for the $result")
//    False
//  }
}

val myToString = new ToStringExample(3, 2)
myToString.result
myToString.result.toString


//class Animal {
//  def speak(): Unit = {
//    println("Animal is speaking")
//  }
//}
//
//class Dog extends Animal {
//  override def speak(): Unit = {
//    println("Dog is barking")
//  }
//}
//
//
//val animal: Animal = new Animal
//animal.speak() // Output: Animal is speaking
//
//val dog: Dog = new Dog
//dog.speak() // Output: Dog is barking
//
//val anotherAnimal: Animal = new Dog
//anotherAnimal.speak() // Output: Dog is barking


class Dog(val name: String, var age: Int) {
  require(age<15, "Dogs don't live more than 15 years!")

  def speak(speech: String): Unit = {
    println(speech)
  }
}

try {
  val myDog = new Dog("Belyash", 13)
} catch {
  case e: IllegalArgumentException =>
    {
      println("Unfortunately, your dog already died :(")
    }
} finally {
  println("This is Finally code")
}

class Rational(val n: Int, val d: Int) {
  require(d != 0, "Zero denominator!")

  override def toString: String = s"R($n/$d)"

  def min(other: Rational): Rational =
    if ((n.toDouble / d) < (other.n.toDouble / other.d))
      this else other

  def +(other: Rational): Rational =
    new Rational(
      this.n * other.d + this.d * other.n,
      this.d * other.d
    )
}

val half = new Rational(1, 2)
val fifth = new Rational(1, 5)

val smaller = fifth min half

val sum = half + fifth

val divByZero = new Rational(1, 0)