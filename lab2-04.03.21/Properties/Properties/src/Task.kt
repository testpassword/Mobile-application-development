class PropertyExample {
    var counter = 0
    var propertyWithCounter: Int? = null
        set(new) {
            counter++
            field = new
        }
}
