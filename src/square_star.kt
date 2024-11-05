import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter the number of rows")
    val n = scanner.nextInt()

    for (i in 0 until n) {
        for (j in 0 until n) {
            print("*")
        }
        println()
    }
}

//OUTPUT
/*
Enter the number of rows
8
********
********
********
********
********
********
********
********
 */