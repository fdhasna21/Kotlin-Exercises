//SOLO LEARN
fun main() {
    var hours = 18
    var total: Double = 0.0
    var hoursTemp = hours

    while(hoursTemp>0){
        if(hoursTemp>=24){
            total += 15
            hoursTemp -= 24
            println("masuk 24 $hoursTemp $total")
        }
        else {
            if(hoursTemp<= 5 && hours<24) {
                total = total + (hoursTemp * 1)
                hoursTemp -= 5
                println("masuk 5 $hoursTemp $total")
            }
            else{
                total = total + 0.5
                println("masuk 1 $hoursTemp $total")
                hoursTemp = hoursTemp-1
            }
        }
    }
    println(total)
}