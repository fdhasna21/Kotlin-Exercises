package UK5
//LATIHAN 1 : Membuat Class dan Object

fun main(){
    val bangun1 = persegiPanjang()
    bangun1.panjang=2.0
    bangun1.lebar=3.0
    println("Bangun 1 -"+bangun1.javaClass)
    println("Panjang= "+bangun1.panjang)
    println("Lebar= "+bangun1.lebar)
    println("Luas= "+bangun1.luas())
    println("Keliling= "+bangun1.keliling())
    println()

    val bangun2 = persegi()
    bangun2.panjang=4.0
    println("Bangun 2 -"+bangun2.javaClass)
    println("Panjang= "+bangun2.panjang)
    println("Luas= "+bangun2.luas())
    println("Keliling= "+bangun2.keliling())
    println()

    val bangun3 = lingkaran()
    bangun3.panjang=14.0
    println("Bangun 3 -"+bangun3.javaClass)
    println("Panjang= "+bangun3.panjang)
    println("Luas= "+bangun3.luas())
    println("Keliling= "+bangun3.keliling())
}