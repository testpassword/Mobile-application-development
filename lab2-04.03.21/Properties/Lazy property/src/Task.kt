class LazyProperty(val initializer: () -> Int) {
    var value: Int? = null
    val lazy: Int
    get() = value?: run {
            value = initializer()
            value!!
    }
}
