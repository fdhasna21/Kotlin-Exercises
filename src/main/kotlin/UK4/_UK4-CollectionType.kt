fun main(){
    val a = mutableListOf("A", "B", "C")
    val b = mutableSetOf("Gold", "Silver", "Platinum")
    val c = mutableMapOf<String, Int>()
    c["keys1"] = 10
    c["keys2"] = 15
    c["keys3"] = 20

    a.add("D")
    b.add("Bronze")
    c.put("keys4", 100)

    println(" Before Removing :")
    println(a);println(b);println(c)

    a.removeAt(2)
    b.remove("Gold")
    c.remove("keys3")

    println("\n After Removing :")
    println(a);println(b);println(c)
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    println(numbersMap.mapKeys { it.key.toUpperCase() })
    println(numbersMap.mapValues { it.value + it.key.length })
}

