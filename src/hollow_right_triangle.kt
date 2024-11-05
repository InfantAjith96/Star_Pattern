import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the number of rows: ")
    val n = scanner.nextInt()
    for (i in 1..n) {
        for (j in 1..i) {
            if (j == 1 || i == j || i == n) {
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
Enter the number of rows: 8
*
**
* *
*  *
*   *
*    *
*     *
********
 */