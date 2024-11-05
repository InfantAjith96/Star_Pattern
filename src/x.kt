import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter the number")
    val n = scanner.nextInt()
    val m = 2 * n - 1

    for (i in 1..m) {
        for (j in 1..m) {
            if (i == j || j == (m - i + 1)) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}

//OUTPUT
/*
Enter the number
11
*                   *
 *                 *
  *               *
   *             *
    *           *
     *         *
      *       *
       *     *
        *   *
         * *
          *
         * *
        *   *
       *     *
      *       *
     *         *
    *           *
   *             *
  *               *
 *                 *
*                   *
 */