import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter the odd number only")
    val n = scanner.nextInt()

    for (i in 1..n) {
        if (i == (n / 2) + 1) {
            for (j in 1..n) {
                print("+")
            }
        } else {
            for (j in 1..n / 2) {
                print(" ")
            }
            print("+")
        }
        println()
    }
}

//OUTPUT
/*
Enter the odd number only
13
      +
      +
      +
      +
      +
      +
+++++++++++++
      +
      +
      +
      +
      +
      +
 */