fun main()
{
    //LATIHAN 1 & 2 : Grading berdasarkan Nilai
    var score = 65
    var grade : String
    var note : String

    if(score<=100 && score>=81){grade="A"}
    else if(score<81 && score>=71){grade="B"}
    else if(score<71 && score>=61){grade="C"}
    else if(score<61 && score>=0){grade="D"}
    else{grade="NaN"}

    when(grade){
        "A", "B" -> {note="Passed"}
        "C" -> {note="Remedial"}
        "D" -> {note="Not Passed"}
        else -> {note="NaN"}
    }

    println(" Score : ${score} \n Grade : ${grade} \n Note  : ${note}")
}