def foo(x: Int) = if (x > 10) {
    val r = "To much"
    r
} else {
    val r = x
    r
}

println(foo(3))
println(foo(300))