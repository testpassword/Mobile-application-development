open class Tag(val name: String) {

    protected val children = mutableListOf<Tag>()

    override fun toString() = "<$name>${children.joinToString("")}</$name>"
}

fun table(init: TABLE.() -> Unit): TABLE = TABLE().apply { init() }

class TABLE: Tag("table") {
    fun tr(init: TR.() -> Unit) {
        val tr = TR().apply { init() }
        children += tr
    }
}

class TR: Tag("tr") {
    fun td(init: TD.() -> Unit) { children += TD().apply(init) }
}

class TD: Tag("td")

//<table><tr><td></td><td></td></tr></table>
fun createTable() =
        table {
            tr {
                repeat(2) {
                    td {
                    }
                }
            }
        }

fun main() = println(createTable())