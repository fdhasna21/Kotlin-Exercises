package UK5

open class BangunDatar{
    open var panjang:Double=1.0
    open var lebar:Double=1.0

    open fun luas():Double{
        return panjang * lebar
    }
    open fun keliling():Double{
        return 2*panjang + 2*lebar
    }
}

class persegiPanjang:BangunDatar()

class persegi:BangunDatar(){
    override var lebar: Double
        get() = super.panjang
        set(value) {}
}

class lingkaran:BangunDatar()
{
    override fun luas(): Double{
        return Math.pow(panjang/2,2.0)*3.14
    }

    override fun keliling(): Double {
        return 2*panjang/2*3.14
    }
}