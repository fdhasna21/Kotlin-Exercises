fun main(){
//Anonymous Expression
    val anon: (String, String) -> String = {last, first -> first+" "+last}
    //last, first itu nama variabel dari (String, String)
    //(first+" "+last) itu expression dengan tipe String << yang setelah simbol ->
    println("Anonymous = " + anon("Hasna", "Fernanda"))

//Lambda Expression
    //Lambda Expression itu nyebutin tipe parameternya disamping variabelnya langsung
    //return nya gak perlu disebutin
    //biasanya cuma terdiri dari 1 parameter
    val lamb = {a:Int, b:Int -> (a+b)*a}
    //a,b itu nama variabel dari (Int,Int)
    //(a+b)*a itu expression dari function test() yg dibangun
    println("Lambda = " + lamb(3,4))

    //Lambda Expression 1 Parameter
    val lamb1 = {stringCoba:String -> stringCoba+"\n\t abcdefg"}
    println("Lambda 1 parameter = " + lamb1("ayoapaitu"))

}