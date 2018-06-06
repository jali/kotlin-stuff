// tail recursion
fun fac(n: Int): Int =  when (n) {
	0 ->  1
	else ->  n * fac(n-1)
}

fun main(args: Array<String>){
	println("factorial 5 = ${fac(5)}")
}
