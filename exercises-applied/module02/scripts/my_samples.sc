val smthng: Unit = println("Hello, I'm smthng value")
println(s"The something wants to say: $smthng")

var value1 = 10
def foo(x:Int):Int = {
  value1 + x
}

println(foo(10))

def loo(x:Int):Unit = {
//  var value1 = 100
  value1 += x
//  println(value1)
}

loo(50)
println(s"Congrats! Your account has been advice for $$$value1")

def zoo(x: Int, y: Int): Float = {
  x / y
}

println(zoo(5, 3))

def multipleAndDeviding(a: Int, b: Int): (Int, Float) = {
  val multiple = a * b
  val deviding = a / b
  (a, b)
}

val result = multipleAndDeviding(7, 3)
result._1
result._2

var (f, g, h) = (3, 'a', "how are you?")
f = f + 15
//g = (g + 'e'):String
h = h + 15

val p = 1 + 2
val o = 1.+(2)

val hello = "Hello world"
hello.charAt(3)
hello charAt 3

val myArray = Array(2, 3, 4, 5)
myArray.map(_*2)
myArray map (_*2)
myArray.apply(2)
myArray(2)

//val flexArr = Array.apply[Any](1, 2, "three", "four", 5, 6)
//println(flexArr(3))
//flexArr(3) = 4
//println(flexArr(3))
//val flexList = List.apply[Any](10, 20, 30, "forty", "fifty", 60)
//println(flexList(4))

import scala.collection._
var setImmutable = immutable.Set(1, 2, 3, 4, 5)
var setMutable = mutable.Set(1, 2, 3, 4, 5)

setImmutable += 6
println(setImmutable)
setMutable -= 3
println(setMutable)

val mySet = Set(1,2,3,4,4,4,4,5,6,7,7,7,7)
println(mySet)