fun main(args: Array<String>) {
    var charA: Char = 'A'
    // println(charA == 65) // Char nggak bisa langsung dibandingkan dengan Int
    println(charA.isUpperCase())
    println(charA.isLowerCase())
    println(charA.isDigit())
    println(charA.lowercaseChar()) // ✅ ganti toLowerCase() jadi lowercaseChar()
    val strA: String = charA.toString()
    println("Kini charA sudah menjadi String = " + strA)
}
