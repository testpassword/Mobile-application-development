data class Person(val name: String, val age: Int)

fun getPeople(): Collection<Person> = listOf(Person("Alice", 29), Person("Bob", 31))

fun comparePeople(): Boolean = Person("Alice", 29) == Person("Alice", 29)