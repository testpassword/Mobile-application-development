// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> {
    val amountOfCustomers = customers.count()
    customers.flatMap { it.orders }.flatMap { it.products }.groupBy { it }.mapValues { it.value.count() }.filter { it.value == amountOfCustomers }.keys.toSet()
}

fun Customer.getOrderedProducts(): List<Product> = orders.flatMap(Order::products)