fun printlnBorder(){
  
    println("=====================")
}
fun printlnBorder_repet(){
    repeat(23){   // funcion de repeicion 
     print("=")
    }
    println()
}
// funcion con variable asiganada
fun printlnBorder_variable(border: String){ 
     repeat(23){
         print(border)
     }
    println()
}

fun main(){
   
    // colocamos una variable
    val border ="%"
    val age = 5 * 365
    val name = "Ailan"
    println("Happy Birthday, Ailan!")
    // Esto es una line del cumple
    
    // Let 's print cake!
    printlnBorder_repet()
    printlnBorder_variable(border)
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")
    printlnBorder_variable(border)
   // This prints an empty line.
    println("")
    printlnBorder()
    printlnBorder_repet() // sea crea la linea de repecicion 
 // colocamos el valor de la variable
 println("You are already ${age}, days old ${name} !")
 println("${age} is the very best age to celebrate")
}