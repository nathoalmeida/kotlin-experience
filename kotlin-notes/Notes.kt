import java.lang.constant.ClassDesc

fun main() {

    // variables

    fun printMessage(message: String): Unit {  // Unit = there's no return
        println(message)
    }

    // in Kotlin, semicolons are optional

    fun printMessageWithPrefix(message: String, prefix: String = "Info") {
        // "Info" is defined as default

        println("[$prefix] $message") // concatenate

    }

  // vararg: "N" arguments

  fun printAll(vararg messages: String) {
      for (m in messages) println(m)
  }
    printAll("Hello", "Hallo", "Salut")


    // var and val; val can't be changed

    var a: String = "initial"
    var b: Int = 1
    val c = 3

    // Null Safety ; Kotlin doesn't accept null, unless you declare it with ?

    var neverNull: String = "This can't be null; the compiler assumes non-null"
    var maybeNull: String? = "You can keep a null here"

    // classes in kotlin

    class Costumer

    class Contact(val id: Int, var email: String)

    val customer = Customer() // new object, default constructor

    val contact = Contact(1, "something@email.com")

    // generic classes

    class MutableStack<E>(vararg items: E) {
        private val elements = items.toMutableList()

        fun push(element: E) = elements.add(element)

        funk peek(): E = elements.last()

    }

    // generic functions

    fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

    // when statement ([switch] in other languages)

    fun cases(obj: Any) {
        when(obj) {
            1 -> println("One")
            "Hello" -> println("Greeting")
            is Long -> println("Long")
            !is String -> println("Not a string")
            else -> println("Unknown") // [default]
        }
    }

    // when expression

    println(whenAssign("Hello"))

    fun whenAssign(obj: Any): Any {
        val result = when (obj) {
            1 -> "one"
            "Hello" -> 1
            is Long -> false
            else -> 42
        }
    }

    // loops
    // for loop
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        prinln("Yummy, it's a $cake cake!")
    }

    //while and do-while

    fun eatAcake() = println("Eat a cake")
    fun bakeAcake() = println("Bake a cake")

    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {
        eatAcake()
        cakesEaten ++

    }

    do {
        bakeAcake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)

    // iterators

    class Animal(val name: String)

    class Zoo(val animals: List<Animal>) {

        operator fun iterator(): Iterator<Animal> {
            return animals.iterator()
        }
    }

    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))
    val zoo = Zoo(animals)

    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }

    // ranges

    for(i in 0..3) { // from zero to three, including three
        print(i)
    }

    for(i in 0 until 3) {// does not include three
        print(i)
    }

    for(i in 2..8 step 2) { // jump 2 in 2 steps
        print(i)
    }

    for(i in 3 downTo 0) { // decrements
        print(i)
    }

    // char ranges

    for (c in 'a'..'d') {
        print(c)
    }

    for(c in 'z'..'s' step 2) {
        print(c)
    }

    // equality checks

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == authors) // structure comparison
    println( authors === writers) // reference comparison, in memory address


    // ternary if
    fun max(a: Int, b: Int) = if (a >b) a else b

    fun maxOld(a: Int, b: Int): Int {
        if(a > b) {
            return a
            else {it
                return b
            }

        }
    }

    // collections
    // lists (accept duplicated values)

    val systemUsers: MutableList<Int> = mutableListOf(1,2,3)
    val sudoers: List<Int> = systemUsers /* create a variable with a copy
    of systemUsers only to read values */

    fun addSystemUser(newUser: Int) {
        systemUsers.add(newUser)
    }

    fun getSysSudoers(): List<Int> {
        return sudoers
    }

    addSystemUser(4)
    println("Tot sudoers: ${getSysSudoers().size}")
    getSysSudoers().forEach {
        i -> println("Some useful info on user $i")
    }

    // set (does not accept duplicated values)

    val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")

    fun addIssue(uniqueDesc: String): Boolean {
        return openIssues.add(uniqueDesc)
    }

    fun getStatusLog(isAdded: Boolean): String {
        return if(isAdded) "registered correctly." else "marked as duplicate and rejected"
    }

    val aNewIssue: String = "uniqueDescr4"
    val andIssueAlreadyIn: String = "uniqueDescr2"

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("Issue $andIssueAlreadyIn ${getStatusLog(addIssue(andIssueAlreadyIn))}") //must not accept it because it's duplicated

    // maps (key and value)

    const val POINTS_X_PASS: Int = 15
    val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
    val EZPassReports: Map<Int, Int> = EZPassAccounts

    fun updatePointsCredit(accountId: Int) {
        if(EZPassAccounts.containsKey(accountId)) {
            println("Updating $accountId...")
            EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS
        } else {
            println("Error: Trying o update a non-existing account (id: $accountId")
        }
    }

}