(10 to 20).foreach(i => {
  println(i)
  println(i*10)
  })

def isEven(n: Int): Boolean = n % 2 == 0

def isOdd(n: Int): Boolean = n % 2 != 0

val oddSeq = for {
  digit <- 1 to 100
  if isOdd(digit)
} yield digit

println(oddSeq)