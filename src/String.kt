fun main(args: Array<String>) {
    val myName: String = "Eggy Nanda Frayuda"
    for(chr in myName){
        print(chr)
    }
    print('\n')
    val s = "abc" + 1
    println(s + "def")
    print('\n')
    var text = """
    for (c in "foo")
    print(c)
    """
    println(text)
    var teks = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
    println(teks)
}