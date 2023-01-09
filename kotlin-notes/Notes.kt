
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



}