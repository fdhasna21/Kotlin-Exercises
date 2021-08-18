import java.text.NumberFormat
import java.util.*

fun main(){
    //LATIHAN 4 : Harga Diskon berdasarkan Member
    var price = 749999
    var point : Int = 450
    var member : String
    var disc : Int
    var totalPrice : String

    if(point<=1000 && point>500) {member="Platinum"; disc=30}
    else if(point<=500 && point>300) {member="Gold"; disc=15}
    else if(point<=300 && point>100) {member="Silver"; disc=5}
    else if(point<=100 && point>=0) {member="Bronze"; disc=0}
    else {member="NaN"; disc=0}

    if(member!="NaN"){totalPrice = NumberFormat.getCurrencyInstance(Locale("in", "ID")).format(price-((price * disc)/100))}
    else {totalPrice=NumberFormat.getCurrencyInstance(Locale("in", "ID")).format(0)}

    println(" Member : ${member} (${point} point) \n " +
            "Price  : ${NumberFormat.getCurrencyInstance(Locale("in", "ID")).format(price)} \n " +
            "Disc.  : ${disc}% \n Total Price  : ${totalPrice}")
}

