fun main(){
    //LATIHAN 6 : Konversi Biner ke Desimal
    val bin = "100"
    var x = 0
    var dec = 0

    for(i in bin.length downTo 1 step 1 ){
        //char dari string (char) -> ubah ke string -> ubah ke int
        dec = dec + (bin.get(x).toString().toInt() * Math.pow(2.0,i.toDouble()-1).toInt())
        println("${bin.get(x).toString().toInt()} * ${Math.pow(2.0,i.toDouble()-1).toInt()} = " +
                "${(bin.get(x).toString().toInt() * Math.pow(2.0,i.toDouble()-1).toInt())}")
        x++
    }

    println("The decimal of $bin is $dec")
}