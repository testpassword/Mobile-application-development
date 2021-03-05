fun task(): List<Boolean> {
    val isEven: Int.() -> Boolean = { this % 2 == 0 }
    val isOdd: Int.() -> Boolean = { this.isEven().not() }
    return listOf(42.isOdd(), 239.isOdd(), 294823098.isEven())
}
