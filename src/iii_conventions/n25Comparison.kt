package iii_conventions

import util.TODO
import util.doc25

fun todoTask25(): Nothing = TODO(
        """
        Task 25.
        Uncomment the commented line and make it compile. 
        Make all the changes to the file MyDate.kt.

        Tips: Make the class 'MyDate' implement 'Comparable'.
    """,
        documentation = doc25(),
        references = { date: MyDate, comparable: Comparable<MyDate> -> }
)

fun task25(date1: MyDate, date2: MyDate): Boolean {
    return date1 < date2
}

operator fun MyDate.compareTo(other: MyDate): Int {
    val compareYear = this.year.compareTo(other.year)
    if (compareYear != 0) return compareYear

    val compareMonth = this.month.compareTo(other.month)
    if (compareMonth != 0) return compareMonth

    return this.dayOfMonth.compareTo(other.dayOfMonth)
}

