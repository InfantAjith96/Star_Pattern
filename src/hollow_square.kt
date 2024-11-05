fun main() {
    print("Enter the number of rows: ")
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        for (j in 1..n) {
            if (i == 1 || i == n || j == 1 || j == n) {
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
*      *
*      *
*      *
*      *
*      *
*      *
********

 */