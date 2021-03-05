fun renderProductTable(): String =
    html {
        table {
            tr(getTitleColor()) {
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            getProducts().forEachIndexed { i, el ->
                tr {
                    td(getCellColor(i, 0)) {
                        text(el.description)
                    }
                    td(getCellColor(i, 1)) {
                        text(el.price)
                    }
                    td(getCellColor(i, 2)) {
                        text(el.popularity)
                    }
                }
            }
        }
    }.toString()

fun getTitleColor(): String = "#b9c9fe"
fun getCellColor(index: Int, row: Int): String = if ((index + row) % 2 == 0) "#dce4ff" else "#eff2ff"
