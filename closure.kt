// using lambda expression
fun makeAdder(x: Int) = { y: Int -> x + y }

// using annonymous function
fun makeMult(x: Int): (Int) -> Int { 
	return fun(y: Int): Int { 
		return x * y 
	}
}


fun main(args: Array<String>) {
	val add5 = makeAdder(5)
	val add10 = makeAdder(10)
	println("add5(10) : ${add5(10)} \nadd10(10) : ${add10(10)}")
    
	val mult5 = makeMult(5)
	println("mult5(10) : ${mult5(10)}")
}
