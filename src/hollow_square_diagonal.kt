import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the number of rows: ")
    val n = scanner.nextInt()

    for (i in 1..n) {
        for (j in 1..n) {
            if (i == 1 || i == n || j == 1 || j == n - i + 1 || i == j || j == n) {
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
********
**    **
* *  * *
*  **  *
*  **  *
* *  * *
**    **
********
 */