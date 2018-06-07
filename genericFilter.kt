// demonstration of how filter is implemented in functional programming style
// filtern is an extension function that can be used on any list of any type
// usage: 
// val lst = listOf(1,2,3,4,5,6,7,8,9)
// print(lst.filter { it % 2 == 0 })
// will print [2, 4, 6, 8]

val <T> List<T>.tail: List<T>
    get() = drop(1)

val <T> List<T>.head: T
    get() = first()

fun <T> List<T>.filtern(predi: (T) -> Boolean): List<T>  {
    fun loop(input: List<T>, output: List<T>, predi: (T) -> Boolean): List<T> =
        when {
            input.isEmpty() 			      -> output
            (predi(input.head) == true) -> loop(input.tail, output + listOf(input.head), predi)
            else 						            -> loop(input.tail, output, predi)
        }
    return loop(this, listOf(), predi)
}
