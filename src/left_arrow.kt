import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the number of columns: ")
    val n = scanner.nextInt()

    // printing the upper part of the pattern
    for (i in 1..n) {
        for (j in 1..(n - i)) {
            print(" ")
        }
        for (k in 0..(n - i)) {
            print("*")
        }
        println()
    }
    for (i in 1 until n) {
        for (j in 1..(i + 1)) {
            print(" ")
        }
        for (k in 1..(i + 1)) {
            print("*")
        }
        println()
    }
}

//OUTPUT
/*
Enter the number of columns: 8
       ********
      *******
     ******
    *****
   ****
  ***
 **
*
  **
   ***
    ****
     *****
      ******
       *******
        ********

 */