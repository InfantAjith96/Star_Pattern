import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    print("Enter the number of columns: ")
    val n = reader.nextInt()

    for (i in 1..n) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }

    for (i in n - 1 downTo 1) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}

//OUTPUT
/*
Enter the number of columns: 8
*
**
***
****
*****
******
*******
********
*******
******
*****
****
***
**
*

 */