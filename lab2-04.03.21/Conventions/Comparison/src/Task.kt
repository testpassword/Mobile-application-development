data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {

    override operator fun compareTo(other: MyDate): Int = (year + month + dayOfMonth) - (other.year + other.month + other.dayOfMonth)
}

fun test(date1: MyDate, date2: MyDate) = println(date1 < date2)
