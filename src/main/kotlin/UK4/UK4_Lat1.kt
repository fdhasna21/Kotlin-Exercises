//LATIHAN 1 : Mengimplementasikan fungsi pada array
fun printArray(array: Array<String>){
    array.forEach {print(" "+it)}
    println()
}

fun main(){
    val fruitArray = arrayOf("blueberry", "durian", "apple", "elderberry", "cherry")

    println("fruitArray with ${fruitArray.size} elements :");printArray(fruitArray)
    println()

    println("fruitArray[3] = ${fruitArray.get(3)}")
    println()

    print("fruitArray.set(0,mango) ->"); fruitArray.set(0,"mango")
    printArray(fruitArray)
    println()

    print("Cherry index before sorted : "); println(fruitArray.indexOf(fruitArray.find{it=="cherry"}))
    val fruitArraySorted = fruitArray.sortedArrayDescending();
    print("Cherry index after sorted : "); println(fruitArraySorted.indexOf(fruitArray.find{it=="cherry"}))
    println()

    print("fruitArray sorted by descending :");printArray(fruitArraySorted)
    println()

    print("fruitArray.shuffle() :"); fruitArraySorted.shuffle()
    printArray(fruitArray)

    print("fruitArray.random() : "); println(fruitArraySorted.random())

}