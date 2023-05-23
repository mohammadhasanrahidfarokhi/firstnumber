fun main() {
//    val start = 100
//    val end = 999
    for (i in 2..50) {
        var l = true
        for (j in 2 until i) {
            if (i % j == 0) {
                l = false
                break
            }
        }
        if (l)
            print("$i ")
    }
}