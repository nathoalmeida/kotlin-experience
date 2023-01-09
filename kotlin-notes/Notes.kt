
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



}