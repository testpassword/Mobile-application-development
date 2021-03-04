import java.lang.IllegalArgumentException

fun failWithWrongAge(age: Int?): Nothing = throw IllegalArgumentException("Wrong age: $age")

fun checkAge(age: Int?): Unit = if (age == null || age !in 0..150) failWithWrongAge(age) else println("Congrats! Next year you'll be ${age + 1}.")

fun main() = checkAge(10)