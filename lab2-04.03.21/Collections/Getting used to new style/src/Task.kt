fun doSomethingWithCollection(collection: Collection<String>): Collection<String>? {
    val groupsByLength = collection.groupBy(String::length)
    val maximumSizeOfGroup = groupsByLength.values.map{ it.count() }.max()
    return groupsByLength.values.firstOrNull { it.count() == maximumSizeOfGroup  }
}
