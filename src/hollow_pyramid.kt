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
            if (k == 1 || k == 2 * i - 1 || i == n) {
                print("*")
            } else {
                print(" ")
            }
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
      * *
     *   *
    *     *
   *       *
  *         *
 *           *
***************
 */