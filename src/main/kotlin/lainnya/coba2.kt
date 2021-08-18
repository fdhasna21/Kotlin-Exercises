//SOLO LEARN
var cost: Double = 0.0
fun shippingCost(amount: Double, international: Boolean): Double {
    if (amount>=75 && international==false) {cost=0.0}
    else{
        if(international==false){
            cost=amount*0.1
        }
        else{
            cost = amount*0.15
            if(cost>=50.0){cost=50.0}
        }
    }
    return cost
}

fun main(args: Array<String>) {
    val total = 199.99
    val international = true
    println(shippingCost(total, international))
}