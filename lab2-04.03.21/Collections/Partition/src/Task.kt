// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> =
    customers.partition {
        val (delivered, undelivered) = it.orders.partition(Order::isDelivered)
        undelivered.count() > delivered.count()
    }.first.toSet()
