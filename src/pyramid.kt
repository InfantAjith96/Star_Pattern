import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter the number of rows")
    val n = scanner.nextInt()
    var m = n

    for (i in 1..n) {
        for (j in 1 until m) {
            print(" ")
        }
        for (k in 1..(2 * i - 1)) {
            print("*")
        }
        m--

        println()
    }
}

//OUTPUT
/*
Enter the number of rows
8
       *
      ***
     *****
    *******
   *********
  ***********
 *************
***************
 */