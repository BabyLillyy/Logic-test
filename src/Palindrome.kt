fun main() {
    println(isPalindrome("aka"))
    println(isPalindrome("Level"))
    println(isPalindrome("Hello"))
}

fun isPalindrome(inputText: String): String {
    val input = inputText.lowercase()
    val revertText = input.reversed()

    return if (input == revertText) "$input is a palindrome"
    else "$input isn't a palindrome"
}