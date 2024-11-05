import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter the number of rows")
    val n = scanner.nextInt()
    var spaces = n - 1
    var stars = 1

    for (i in 1..n) {
        for (j in 1..spaces) {
            print(" ")
        }
        for (k in 1..stars) {
            print("*")
        }
        if (spaces > i) {
            spaces -= 1
            stars += 2
        }
        if (spaces < i) {
            spaces += 1
            stars -= 2
        }
        println()
    }
}

//OUTPUT
/*
Enter the number of rows
8
       *
      ***
     *****
    *******
    *******
     *****
      ***
       *
 */