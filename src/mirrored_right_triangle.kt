import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var m = 1
    println("Enter the number of rows")
    val n = scanner.nextInt()

    for (i in n downTo 1) {
        for (j in 1 until i) {
            print(" ")
        }
        for (k in 1..m) {
            print("*")
        }
        println()
        m++
    }
}

//OUTPUT
/*
Enter the number of rows
8
       *
      **
     ***
    ****
   *****
  ******
 *******
********
 */