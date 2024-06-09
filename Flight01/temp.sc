val x = 10
val y = 20

def foo(x: Int): Any = if (x > 50) {
  val res = "Too much!"
  res
} else {
  val res = "That's good! It's fine for me!"
  res
}

foo(9)

var g = -3

do {
  println(g)
  g -= 1
} while(g>0)

