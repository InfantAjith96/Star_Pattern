import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter the number of rows")
    val n = scanner.nextInt()

    for (i in 1..n) {
        for (j in 1 until i) {
            print(" ")
        }
        for (k in 1..n) {
            if (i == 1 || i == n || k == 1 || k == n) {
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
Enter the number of rows
8
********
 *      *
  *      *
   *      *
    *      *
     *      *
      *      *
       ********
 */