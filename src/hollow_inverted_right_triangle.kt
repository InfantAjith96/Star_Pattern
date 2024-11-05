import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var m = 1
    println("Enter the number of rows")
    val n = scanner.nextInt()

    for (i in n downTo 1) {
        for (j in 1..i) {
            if (j == 1 || j == i || i == n) {
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
*     *
*    *
*   *
*  *
* *
**
*
 */