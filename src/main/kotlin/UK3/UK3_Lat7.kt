import java.text.NumberFormat
import java.util.*

//LATIHAN 7 : Mengubah file latihan 1-6 ke dalam bentuk function dalam latihan 7
fun gradingScore(score:Int):String{
    fun getGrade():String{
        if(score<=100 && score>=81){return "A"}
        else if(score<81 && score>=71){return "B"}
        else if(score<71 && score>=61){return "C"}
        else if(score<61 && score>=0){return "D"}
        else{return "Invalid grade"}
    }

    fun getNote(gr : String):String{
        when(gr){
            "A", "B" -> {return "Passed"}
            "C" -> {return "Remedial"}
            "D" -> {return "Not Passed"}
            else -> {return "Please re-input the score"}
        }
    }
    return " Score : ${score} \n Grade : ${getGrade()} \n Note  : ${getNote(getGrade())}"
}

fun discPrice(price: Int, memberType:Boolean=false, memberPoint:Int=0):String{
    val disc : Int
    var member = ""
    var printData = ""

    fun getDisc():Int{
        if(memberType==true){
            if(memberPoint<=1000 && memberPoint>500) {member = "Platinum"; return 30}
            else if(memberPoint<=500 && memberPoint>300) {member = "Gold"; return 15}
            else if(memberPoint<=300 && memberPoint>100) {member = "Silver"; return 10}
            else if(memberPoint<=100 && memberPoint>=0) {member = "Bronze"; return 0}
            else {member = "Invalid member type"; return 0}
        }
        else{
            if(price<500000 && price>0){return 5}
            else if(price<750000 && price>=500000){return 10}
            else if(price<1000000 && price>=750000){return 15}
            else if(price>=1000000){return 30}
            else{return 0}
        }
    }

    fun getCurrency(nominal:Int):String{
        val myCurrency = NumberFormat.getCurrencyInstance(Locale("in", "ID"))
        myCurrency.minimumFractionDigits = 0; return myCurrency.format(nominal)
    }

    fun getTotalPrice(perDisc:Int):Int{
        if(price<0){return 0}
        else{return (price-(price * perDisc)/100)}
    }

    disc = getDisc()
    if(memberType==true){printData+=" Member : ${member} (${memberPoint} point) \n"}
    printData += " Price  : ${getCurrency(price)} \n Disc.  : ${disc}% \n Total Price  : ${getCurrency(getTotalPrice(disc))}"
    return printData
}

fun convert(binIn:String="", decIn:Int=0):String{
    var bin = ""
    var dec = 0
    var decTemp = decIn
    var x=0

    fun dec2bin():String{
        do{
            bin = (decTemp % 2).toString() + bin
            decTemp = decTemp/2
        }
        while(decTemp>0)
        return "The binary of $decIn is $bin"
    }

    fun bin2dec():String{
        for(i in binIn.length downTo 1 step 1 ){
            dec = dec + (binIn.get(x).toString().toInt() * Math.pow(2.0,i.toDouble()-1).toInt())
            /*println("${binIn.get(x).toString().toInt()} * ${Math.pow(2.0,i.toDouble()-1).toInt()} = " +
                    "${(binIn.get(x).toString().toInt() * Math.pow(2.0,i.toDouble()-1).toInt())}")*/
            x++
        }
        return "The decimal of $binIn is ${dec.toString()}"
    }

    if(binIn!=""){return bin2dec()}
    else {return dec2bin()}
}

fun main(){
    println("-- LATIHAN 1 & 2 --\n" + gradingScore(-90) + "\n")
    println("-- LATIHAN 3 --\n" + discPrice(500000) + "\n")
    println("-- LATIHAN 4 --\n" + discPrice(250000, true, 250) + "\n")
    println("-- LATIHAN 5 --\n" + convert(binIn = "10") + "\n")
    println("-- LATIHAN 6 --\n" + convert(decIn = 14))
}