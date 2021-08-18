import java.text.NumberFormat
import java.util.*

fun main(){
    //LATIHAN 3 : Harga Diskon
    var price = 600000
    var disc : Int
    var totalPrice : String

    if(price<500000 && price>0){disc=5}
    else if(price<750000 && price>=500000){disc=10}
    else if(price<1000000 && price>=750000){disc=15}
    else if(price>=1000000){disc=30}
    else{disc=0}

    if(disc!=0){totalPrice = NumberFormat.getCurrencyInstance(Locale("in", "ID")).format(price-((price * disc)/100))}
    else {totalPrice=NumberFormat.getCurrencyInstance(Locale("in", "ID")).format(0)}
    println(" Price : ${NumberFormat.getCurrencyInstance(Locale("in", "ID")).format(price)} \n" +
            " Disc. : ${disc}% \n Total Price  : ${totalPrice}")
}

