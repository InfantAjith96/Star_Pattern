import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter the number of rows")
    val n = scanner.nextInt()
    for (i in n downTo 1) {
        for (j in 1 until i) {
            print(" ")
        }
        for (k in 1..n) {
            print("*")
        }
        println()
    }
}

//OUTPUT
/*
Enter the number of rows
8
       ********
      ********
     ********
    ********
   ********
  ********
 ********
********
 */