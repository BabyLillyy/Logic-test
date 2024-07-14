fun main() {
    println(findMiddleIndex(intArrayOf(1, 3, 5, 7, 9)))
    println(findMiddleIndex(intArrayOf(3, 6, 8, 1, 5, 10, 1, 7)))
    println(findMiddleIndex(intArrayOf(3, 5, 6)))
}

fun findMiddleIndex(list: IntArray): String {
    val totalSum = list.sum()
    var leftSum = 0

    for (i in list.indices) {
        val rightSum = (totalSum - leftSum) - list[i]
        if (rightSum == leftSum) {
            return "Middle index is $i"
        }
        leftSum += list[i]
    }

    return "Index not found"
}