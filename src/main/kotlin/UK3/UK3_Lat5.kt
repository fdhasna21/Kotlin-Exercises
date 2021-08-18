fun main(){
    //LATIHAN 5 : Konversi Desimal ke Biner
    val dec = 15
    var bin = ""
    var decTemp = dec

    do{
        bin = (decTemp % 2).toString() + bin
        decTemp = decTemp/2
    }
    while(decTemp>0)

    println("The binary of $dec is $bin")
}
